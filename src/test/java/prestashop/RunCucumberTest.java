package prestashop;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("prestashop")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json, json:target/cucumber-report/cucumber.json")
public class RunCucumberTest {
}
