/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.datatools.sqltools.data.internal.ui.extract;

import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.popup.AbstractAction;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.sqltools.data.internal.ui.DataUIPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardDialog;

public class ExtractDataAction extends AbstractAction
{
    private static final String TEXT = Messages.getString("ExtractDataMenu"); //$NON-NLS-1$
    
    protected Table table = null;
    
    protected void initialize()
    {
        initializeAction(null, null, TEXT, TEXT);
    }

    public void run()
    {

        if (table == null)
            return;

        ExtractDataWizard wiz = new ExtractDataWizard(table);
        WizardDialog dialog = new WizardDialog(org.eclipse.swt.widgets.Display.getCurrent().getActiveShell(), wiz);
        dialog.create();
        dialog.open();

    }

    public void selectionChanged(SelectionChangedEvent event)
    {
        table = null;

        if (event.getSelection() instanceof IStructuredSelection)
        {
            if (((IStructuredSelection) event.getSelection()).getFirstElement() instanceof Table)
            {
                table = (Table) ((IStructuredSelection) event.getSelection()).getFirstElement();
            }
        }
            if (isEnabled() && table != null)
            {
                setEnabled(DataUIPlugin.isGroupIDOK(table));
            }

    }
}
