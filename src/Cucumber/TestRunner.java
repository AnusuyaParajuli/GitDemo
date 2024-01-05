package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/Cucumber",glue="selenium.cucumber",monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
