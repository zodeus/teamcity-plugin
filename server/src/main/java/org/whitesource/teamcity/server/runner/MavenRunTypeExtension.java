/**
 * Copyright (C) 2012 White Source Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.whitesource.teamcity.server.runner;

import jetbrains.buildServer.web.openapi.PluginDescriptor;
import jetbrains.buildServer.web.openapi.WebControllerManager;
import org.jetbrains.annotations.NotNull;
import org.whitesource.teamcity.common.Constants;

import java.util.Arrays;
import java.util.Collection;

/**
 * Concrete implementation for maven jobs.
 *
 * @author Edo.Shor
 */
public class MavenRunTypeExtension extends BaseRunTypeExtension {

    /* --- Static members --- */

    private static final Collection<String> SUPPORTED_RUN_TYPES = Arrays.asList(Constants.RUNNER_MAVEN);

    /* --- Constructors --- */

    /**
     * Constructor
     *
     * @param pluginDescriptor
     * @param webControllerManager
     */
    public MavenRunTypeExtension(@NotNull final PluginDescriptor pluginDescriptor,
                                 @NotNull final WebControllerManager webControllerManager) {
        super(webControllerManager, pluginDescriptor);

        registerView("viewMavenRunner.html", "runner/viewMavenRunner.jsp");
        registerEdit("editMavenRunner.html", "runner/editMavenRunner.jsp");
    }

    /* --- Concrete implementation methods --- */

    @Override
    public Collection<String> getRunTypes() {
        return SUPPORTED_RUN_TYPES;
    }

}