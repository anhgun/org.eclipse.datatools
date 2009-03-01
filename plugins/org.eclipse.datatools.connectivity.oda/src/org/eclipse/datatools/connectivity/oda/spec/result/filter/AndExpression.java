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

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.connectivity.oda.spec.ValidationContext;

/**
 * A runtime composite filter expression whose child expressions are combined by the And boolean operator.  
 * This composite expression is evaluated to be true only if all its child expressions are evaluated as true.  
 * @since 3.2 (DTP 1.7)
 */
public class AndExpression extends CompositeExpression
{
    /**
     * Gets this expression's name.
     * @return the simple name of this class
     */
    public static String getName()
    {
        return AndExpression.class.getSimpleName();
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.datatools.connectivity.oda.spec.result.filter.CompositeExpression#validate(org.eclipse.datatools.connectivity.oda.spec.ValidationContext)
     */
    @Override
    public void validate( ValidationContext context ) throws OdaException
    {
        super.validate( context );
        
        validateMinElements( 2 );
    } 

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals( final Object object )
    {
        if( !(object instanceof AndExpression) )
            return false;

        final AndExpression that = (AndExpression) object;
        return equals( this.getExpressions(), that.getExpressions() );
    }

}
