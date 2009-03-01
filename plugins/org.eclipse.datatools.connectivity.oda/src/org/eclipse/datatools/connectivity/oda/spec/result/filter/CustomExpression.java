/*
 *************************************************************************
 * Copyright (c) 2009 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation - initial API and implementation
 *  
 *************************************************************************
 */

package org.eclipse.datatools.connectivity.oda.spec.result.filter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.connectivity.oda.nls.Messages;
import org.eclipse.datatools.connectivity.oda.spec.ExpressionArguments;
import org.eclipse.datatools.connectivity.oda.spec.ExpressionVariable;
import org.eclipse.datatools.connectivity.oda.spec.ITester;
import org.eclipse.datatools.connectivity.oda.spec.ValidationContext;
import org.eclipse.datatools.connectivity.oda.spec.manifest.FilterExpressionDefinition;
import org.eclipse.datatools.connectivity.oda.spec.manifest.ResultExtensionExplorer;
import org.eclipse.datatools.connectivity.oda.spec.manifest.SupportedDataSetType;

/**
 * Represents an instance of custom filter expression contributed by an extension of
 * the org.eclipse.datatools.connectivity.oda.dynamicResultSet extension point.
 * @since 3.2 (DTP 1.7)
 */
public class CustomExpression extends AtomicExpression implements IExecutableExtension
{
    private static final String QUALIFER_SEPARATOR = "."; //$NON-NLS-1$
    private String m_id;
    private String m_extensionId;
    private Map<String,Object> m_customData;
    private FilterExpressionDefinition m_definition;  // expects 1-n-only-1 associated FilterExpressionDefinition

    /*
     * Constructor for internal use only.
     * @param extensionId   unique id of the filterExpressions extension that declares this custom expression
     * @param id    expression id
     */
    public CustomExpression( String extensionId, String id )
    {
        this( extensionId, id, null, null );
    }
    
    /*
     * Constructor for internal use only.
     */
    public CustomExpression( String extensionId, String id, ExpressionVariable variable, ExpressionArguments args )
    {
        super( variable, args );
        m_extensionId = extensionId;
        m_id = id;
    }
    
    /*
     * Constructor for internal use only by org.eclipse.core.runtime.IExecutableExtension#setInitializationData.
     */
    public CustomExpression()
    {
        super( null, null );
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
     */
    public void setInitializationData( IConfigurationElement exprElement,
            String propertyName, Object data ) throws CoreException
    {
        m_extensionId = exprElement.getDeclaringExtension().getUniqueIdentifier();
        try
        {
            m_id = FilterExpressionDefinition.getIdAttributeValue( exprElement );
        }
        catch( OdaException ex )
        {
            throw new CoreException( new Status( IStatus.ERROR, exprElement.getContributor().getName(), ex.getLocalizedMessage() ) );
        }
    }

    /**
     * Gets the expression id.  It is unique within the contributing extension.
     * @return the expression id
     */
    public String getId()
    {
        return m_id;
    }
    
    /**
     * Gets the unique id of the filterExpressions extension that declares this custom expression type.
     * @return unique id of declaring extension
     */
    public String getDeclaringExtensionId()
    {
        return m_extensionId;
    }
 
    /*
     * (non-Javadoc)
     * @see org.eclipse.datatools.connectivity.oda.spec.result.FilterExpression#getQualifiedId()
     */
    public String getQualifiedId()
    {
        return m_extensionId + QUALIFER_SEPARATOR + m_id;
    }
    
    /**
     * Indicates whether this expression can be applied to the specified data set type within the data source type.
     * @param odaDataSourceId   id of an ODA data source extension
     * @param odaDataSetId      id of an ODA data set defined within the data source extension
     * @return  true if this can be applied to the specified data set type; false otherwise
     */
    public boolean supportsDataSetType( String odaDataSourceId, String odaDataSetId )
    {
        FilterExpressionDefinition defn = getDefinition();
        if( defn == null )
            return false;
        
        return defn.supportsDataSetType( odaDataSourceId, odaDataSetId );
    }
    
    /**
     * Indicates whether this expression can be applied to the specified data set type.
     * @param dataSetType   an instance of {@link SupportedDataSetType} 
     * @return  true if this can be applied to the specified ODA data set type; false otherwise
     */
    public boolean supportsDataSetType( SupportedDataSetType dataSetType )
    {
        if( dataSetType == null )
            return false;
        return supportsDataSetType( dataSetType.getOdaDataSourceId(), dataSetType.getOdaDataSetId() );
    }
    
    /**
     * Gets the value of an extension-defined property of the specified name.
     * An extension contributor may have arbitrary objects associated with an expression. 
     * @param key   the name of property
     * @return      the value of the named property, or null if it has not been set
     */
    public Object getData( String key )
    {
        if( m_customData == null )
            return null;
        return m_customData.get( key );
    }

    /**
     * Sets the value of an extension-defined property of the specified name.
     * An extension contributor may use this to associate arbitrary objects with an expression.
     * @param key   the name of property
     * @param value the new value of the named property
     */
    public void setData( String key, Object value )
    {
        if( m_customData == null )
            m_customData = new HashMap<String,Object>();
        m_customData.put( key, value );
    }
    
    /**
     * Gets the definition of this expression's capabilities and metadata, as registered by the provider 
     * in its extension of the <i>org.eclipse.datatools.connectivity.oda.dynamicResultSet</i> extension point.
     * @return  definition of this custom filter expression
     */
    public FilterExpressionDefinition getDefinition()
    {
        // obtain from extension manifest explorer by extensionId + id
        if( m_definition == null )
        {
            try
            {
                m_definition = ResultExtensionExplorer.getInstance()
                    .getExtensionFilterDefinition( getDeclaringExtensionId(), getId() );
            }
            catch( OdaException ex )
            {
                // TODO log warning
                ex.printStackTrace();
                return null;
            }
        }
        return m_definition;
    }
    
    /*
     * (non-Javadoc)
     * @see org.eclipse.datatools.connectivity.oda.spec.result.FilterExpression#validate(org.eclipse.datatools.connectivity.oda.spec.ValidationContext)
     */
    public void validate( ValidationContext context ) throws OdaException
    {
        FilterExpressionDefinition defn = getDefinition();
        if( defn == null )
            throw new OdaException( 
                    Messages.bind( "The custom expression ({0}) is not found in the dynamicResultSet extension registry.",
                                getQualifiedId() ));
        
        validate( context, defn );
    }

    /**
     * Validates that this expression meets the restriction specified
     * by the expression definition. 
     * @param defn
     * @throws OdaException  if validation fails
     */
    protected void validate( ValidationContext context, FilterExpressionDefinition defn ) throws OdaException
    {
        assert( defn != null );
        
        // TODO - validate type of associated variable
        
        // validates the number of argument values matches the range of arguments defined for the expression
        int numArgs = getArguments().valueCount();

        int minArgs = defn.getMinArguments().intValue();
        if( numArgs < minArgs )
            throw new OdaException( 
                    Messages.bind( "The custom expression ({0}) has {1} arguments, but requires a minimum of {2} arguments.",
                                new Object[]{ getQualifiedId(), Integer.valueOf(numArgs), Integer.valueOf(minArgs) } ));

        if( ! defn.supportsUnboundedMaxArguments() ) // not unbounded upper limit, validate max arguments
        {
            int maxArgs = defn.getMaxArguments().intValue();
            if( numArgs > maxArgs )
                throw new OdaException( 
                    Messages.bind( "The custom expression ({0}) has {1} arguments, but allows a maximum of {2} arguments.", 
                                new Object[]{ getQualifiedId(), Integer.valueOf(numArgs), Integer.valueOf(maxArgs) } ));
        }
        
        // up to custom tester class to resolve a variable's data type and validate
        // against one of the expression's restricted data types
        ITester customTester = getTester( context );
        if( customTester != null )
            customTester.validate( this, context );
    }
    
    protected ITester getTester( ValidationContext context )
    {
        // try use the tester in the context, if available
        if( context != null && context.getTester() != null )
            return context.getTester();

        // use tester in the definition, if specified
        try
        {
            if( getDefinition() != null )
                return getDefinition().getTester();
        }
        catch( OdaException ex )
        {
            // TODO log warning
        }

        return null;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.datatools.connectivity.oda.spec.result.FilterExpression#isNegatable()
     */
    @Override
    public boolean isNegatable()
    {
        FilterExpressionDefinition defn = getDefinition();
        return ( defn == null ) ? false : defn.isNegatable();   // default value is false
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.datatools.connectivity.oda.spec.result.filter.AtomicExpression#isOptionable()
     */
    public boolean isOptionable()
    {
        FilterExpressionDefinition defn = getDefinition();
        return ( defn == null ) ? super.isOptionable() : defn.isOptionable();
    }
    
}
