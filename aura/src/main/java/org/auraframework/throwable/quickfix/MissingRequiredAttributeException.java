/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.throwable.quickfix;

import org.auraframework.def.DefDescriptor;
import org.auraframework.def.Definition;
import org.auraframework.system.Location;
import org.auraframework.throwable.AuraExceptionDefDescriptorInfo;

public class MissingRequiredAttributeException extends AuraValidationException
        implements AuraExceptionDefDescriptorInfo {

    private static final long serialVersionUID = -819293607407443413L;
    private static final String MESSAGE = "%s %s is missing required attribute '%s'";
    private final DefDescriptor<?> descriptor;

    public MissingRequiredAttributeException(DefDescriptor<?> descriptor, String attributeName, Location l) {
        super(getMessage(descriptor, attributeName), l);
        this.descriptor = descriptor;
    }
    
    public MissingRequiredAttributeException(DefDescriptor<?> descriptor, String attributeName) {
        this(descriptor, attributeName, null);
    }

    public static String getMessage(DefDescriptor<?> desc, String attributeName) {
        return String.format(MESSAGE, desc.getDefType(), desc.getQualifiedName(), attributeName);
    }

    @Override
    public DefDescriptor<? extends Definition> getDescriptor() {
        return descriptor;
    }

}
