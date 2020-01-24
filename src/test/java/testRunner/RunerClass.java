package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:\\EclipseProject\\com.cucumber.gmail.in\\features\\page1.feature", "E:\\EclipseProject\\com.cucumber.gmail.in\\features\\page2.feature"},
		glue={"stepdefination"},
		plugin={"pretty", "html:target/cucumber-html-report"} )

public class RunerClass 
{
	
}
