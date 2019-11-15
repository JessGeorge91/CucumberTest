package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Jess\\workspace\\First_maven_project\\src\\main\\java\\Feature"
		,glue={"stepdefinition"}
		)
public class TestRunner {

}
