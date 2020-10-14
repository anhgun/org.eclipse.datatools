/*******************************************************************************
 * Copyright (c) 2004, 2008 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.oda.xml.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.enablement.oda.xml.i18n.Messages;

import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;


public class XMLSourceFromPath implements IXMLSource
{
	private String path;
	private String encoding;
	private Object ri;
	private int sizeInM;
	private VTDNav vtdNav;
	
	public XMLSourceFromPath( String path, Object resourceIdentifiers ) throws OdaException
	{	
		if ( path == null || path.equals( "" ) ) //$NON-NLS-1$
		{
			throw new OdaException( Messages.getString( "Connection.PropertiesMissing" ) ); //$NON-NLS-1$
		}
		this.path = path;
		this.ri = resourceIdentifiers;
	}
	
	public XMLSourceFromPath( String path, String encoding, Object resourceIdentifiers ) throws OdaException
	{
		this( path, resourceIdentifiers );
		this.encoding = encoding;
	}

	public InputStream openInputStream( ) throws OdaException
	{
		return ResourceLocatorUtil.getInputStream( ri, path );
	}
	
	public void release( ) throws OdaException
	{
		if(null != vtdNav){
			vtdNav = null;
		}
	}

	public String getEncoding( )
	{
		return encoding;
	}

	public int getSizeInM() {
		if(0 == sizeInM){
			File file = new File(path);
			sizeInM = (int) (file.length() / (1024 * 1024));
		}
		return sizeInM;
	}
	
	public VTDNav loadDocument(){
		if(null == vtdNav){
			FileInputStream fis = null;
			try {
				File f = new File(path);
				fis = new FileInputStream(f);
				byte[] b = new byte[(int) f.length()];
				fis.read(b);
				VTDGen vtdGen = new VTDGen();
				vtdGen.setDoc(b);
				vtdGen.setDocumentEncoding(VTDGen.FORMAT_ISO_8859_1);
				vtdGen.parse(true);
				vtdNav = vtdGen.getNav();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(null != fis)
						fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return vtdNav;
	}
}
