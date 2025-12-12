package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;

import org.junit.jupiter.api.AfterAll;

import pages.BasePage;

@Suite 
@IncludeEngines("cucumber") //Cucumber engine activated
@SelectClasspathResource("features") //It indicates where are the .feature
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") //Package where are the steps
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, io.qase.cucumber7.QaseEventListener")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@QaseId=1")


public class TestRunner {
    @AfterAll
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}

