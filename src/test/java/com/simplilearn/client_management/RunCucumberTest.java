package com.simplilearn.client_management;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/simplilearn/client_management")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.simplilearn.client_management")
public class RunCucumberTest {
}
