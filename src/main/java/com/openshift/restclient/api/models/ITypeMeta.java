/******************************************************************************* 
 * Copyright (c) 2016 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.restclient.api.models;

import com.openshift.internal.restclient.model.JSONSerializeable;

/**
 * Marker interface to kubernetes TypeMeta
 * @author jeff.cantrill
 *
 */
public interface ITypeMeta extends IApiVersionable, IKindable, JSONSerializeable {

}