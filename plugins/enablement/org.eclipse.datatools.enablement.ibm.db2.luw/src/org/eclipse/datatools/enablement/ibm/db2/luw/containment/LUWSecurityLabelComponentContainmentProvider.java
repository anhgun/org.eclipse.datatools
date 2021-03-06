/*******************************************************************************
 * Copyright (c) 2004, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.ibm.db2.luw.containment;

import java.util.Collection;

import org.eclipse.datatools.connectivity.sqm.core.containment.AbstractContainmentProvider;
import org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWPackage;
import org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWSecurityLabelComponent;
import org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWSecurityPolicy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class LUWSecurityLabelComponentContainmentProvider extends AbstractContainmentProvider {
	
	public Collection getContainedElements(EObject obj) {
		Collection children = super.getContainedElements(obj);
		LUWSecurityLabelComponent component = (LUWSecurityLabelComponent) obj;
		for (Object element : component.getElements()) {
			if (element != null) {
				children.add(element);
			}
		}
		return children;
	}

	public EStructuralFeature getContainmentFeature(EObject obj) {
		return LUWPackage.eINSTANCE.getLUWSecurityPolicy_Components();
	}

	public String getGroupId(EObject obj) {
		return LUWGroupID.SECURITY_LABEL_COMPONENT;
	}
	
	public EObject getContainer(EObject obj) {
		EList<LUWSecurityPolicy> policies = ((LUWSecurityLabelComponent) obj).getLUWSecurityPolicy();
		for (LUWSecurityPolicy policy : policies) {
			EList<LUWSecurityLabelComponent> components = policy.getComponents();
			if (components.contains(obj)) {
				return policy;
			}
		}
		return null;
	}
	
}
