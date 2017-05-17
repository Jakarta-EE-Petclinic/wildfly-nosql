/*
 * *
 *  * Copyright 2017 Red Hat, Inc, and individual contributors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.wildfly.extension.nosql.cdi;

import javax.enterprise.inject.Any;
import javax.enterprise.util.AnnotationLiteral;

/**
 * Helper class to instantiate <code>Any</code> qualifier
 *
 * @author Antoine Sabot-Durand
 */
final class AnyLiteral extends AnnotationLiteral<Any> implements Any {

    private static final long serialVersionUID = 1L;

    static final Any INSTANCE = new AnyLiteral();

    private AnyLiteral() {
    }
}
