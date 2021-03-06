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
package org.whitesource.teamcity.common;

/**
 * Utility class to hold constant values used throughout the plugin.
 *
 * @author Edo.Shor
 */
public final class Constants {

    /* --- Plugin constants --- */

    public static final String PLUGIN_NAME = "whitesource";
    public static final String AGENT_TYPE = "teamcity";

    /* --- Runner parameters --- */

    public static final String PLUGIN_PREFIX = "org.whitesource.";
    public static final String RUNNER_DO_UPDATE = PLUGIN_PREFIX + "doUpdate";
    public static final String RUNNER_ORGANIZATION_TOKEN = PLUGIN_PREFIX + "orgToken";
    public static final String RUNNER_OVERRIDE_ORGANIZATION_TOKEN = PLUGIN_PREFIX + "overrideOrgToken";
    public static final String RUNNER_USER_KEY = PLUGIN_PREFIX + "userKey";
    public static final String RUNNER_OVERRIDE_USER_KEY = PLUGIN_PREFIX + "overrideUserKey";
    public static final String RUNNER_CHECK_POLICIES = PLUGIN_PREFIX + "checkPolicies";
    public static final String RUNNER_OVERRIDE_CHECK_POLICIES = PLUGIN_PREFIX + "overrideCheckPolicies";
    public static final String RUNNER_FORCE_UPDATE = PLUGIN_PREFIX + "forceUpdate";
    public static final String RUNNER_FAIL_ON_ERROR = PLUGIN_PREFIX + "failOnError";
    public static final String RUNNER_OVERRIDE_FORCE_UPDATE = PLUGIN_PREFIX + "overrideForceUpdate";
    public static final String RUNNER_OVERRIDE_FAIL_ON_ERROR = PLUGIN_PREFIX + "overrideFailOnError";
    public static final String RUNNER_PRODUCT = PLUGIN_PREFIX + "product";
    public static final String RUNNER_PRODUCT_VERSION = PLUGIN_PREFIX + "productVersion";
    public static final String RUNNER_PROJECT_TOKEN = PLUGIN_PREFIX + "projectToken";
    public static final String RUNNER_MODULE_TOKENS = PLUGIN_PREFIX + "moduleTokens";
    public static final String RUNNER_INCLUDES = PLUGIN_PREFIX + "includes";
    public static final String RUNNER_EXCLUDES = PLUGIN_PREFIX + "excludes";
    public static final String RUNNER_IGNORE_POM_MODULES = PLUGIN_PREFIX + "ignorePomModules";
    public static final String RUNNER_PROXY_HOST = PLUGIN_PREFIX + "proxyHost";
    public static final String RUNNER_PROXY_PORT = PLUGIN_PREFIX + "proxyPort";
    public static final String RUNNER_PROXY_USERNAME = PLUGIN_PREFIX + "proxyUsername";
    public static final String RUNNER_PROXY_PASSWORD = PLUGIN_PREFIX + "proxyPassword";
    public static final String RUNNER_SERVICE_URL = PLUGIN_PREFIX + "serviceUrl";
    public static final String RUNNER_CONNECTION_TIMEOUT_MINUTES = PLUGIN_PREFIX + "connectionTimeoutMinutes";
    public static final String RUNNER_CONNECTION_RETRIES = PLUGIN_PREFIX + "connectionRetries";
    public static final String RUNNER_CONNECTION_RETRIES_INTERVAL = PLUGIN_PREFIX + "connectionRetriesInterval";

    /* --- Runner types --- */

    /**
     * These constants are taken from build agent console log on start up
     */
    public static final String RUNNER_MAVEN = "Maven2";
    public static final String RUNNER_ANT = "Ant";
    public static final String RUNNER_CMD = "simpleRunner";
    public static final String RUNNER_MSBUILD = "MSBuild";
    public static final String RUNNER_POWERSHELL = "jetbrains_powershell";
    public static final String RUNNER_IDEA = "JPS";
    public static final String RUNNER_VS_SOLUTION = "VS.Solution";
    public static final String RUNNER_VS_SLN2003 = "sln2003";

    /* --- Other settings --- */
    public static final String DOT = ".";
    public static final String JAVA_NETWORKING = "java.net";
    public static final String EMPTY_STRING = "";

    /* --- Private constructor --- */

    private Constants() {
        // hide utility class constructor
    }

}
