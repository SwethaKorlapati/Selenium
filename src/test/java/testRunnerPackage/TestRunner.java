package testRunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nagaswetha.korlapati\\Desktop\\Selenium\\WorkSpace\\Maven_Cucumber\\src\\test\\java"
	,glue={"stepDefPackage"
	},plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
   		 monochrome = true ) 
 

public class TestRunner {

}
