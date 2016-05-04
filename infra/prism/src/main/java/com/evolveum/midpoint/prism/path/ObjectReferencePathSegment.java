/*
 * Copyright (c) 2010-2015 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolveum.midpoint.prism.path;

import com.evolveum.midpoint.prism.PrismConstants;

import javax.xml.namespace.QName;

/**
 * Denotes referenced object, like "assignment/targetRef/@/name" (name of assignment's target object)
 *
 * @author mederly
 */
public class ObjectReferencePathSegment extends ReferencePathSegment {

	public static final String SYMBOL = "@";
	public static final QName QNAME = PrismConstants.T_OBJECT_REFERENCE;

	@Override
    public boolean equivalent(Object obj) {
        return equals(obj);
    }

    @Override
    public ItemPathSegment clone() {
        return new ObjectReferencePathSegment();
    }

    @Override
    public String toString() {
        return SYMBOL;
    }
}
