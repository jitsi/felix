/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.scr.annotations;

import java.lang.annotation.*;

/**
 * The <code>Service</code> annotation defines whether and which service
 * interfaces are provided by the component.
 * <p>
 * This annotation is used to declare &lt;service&gt; and &lt;provide&gt;
 * elements of the component declaration. See section 112.4.6, Service Elements,
 * in the OSGi Service Platform Service Compendium Specification for more
 * information.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Service {

    /**
     * The class of the service interface provided by the component. If this
     * property is not set provide elements will be generated for all interfaces
     * generated by the class
     */
    Class<?>[] value() default AutoDetect.class;

    /**
     * Whether the component is registered as a
     * <code>org.osgi.framework.ServiceFactory</code> or not.
     */
    boolean serviceFactory() default false;

}
