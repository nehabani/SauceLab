package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",
glue= {"stepDefinition"},
dryRun=false,

plugin = {"pretty","html:target/htmlReport.html","json:target/CucumberReport.json","junit:target/CucumberReport.xml"},

monochrome=true)
		
public class TestRunner {

}