package Testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\DELL\\Sai\\SeleniumAutomation\\src\\test\\resources\\Features\\Login.feature",
        glue={"StepsDefs" }
)

public class testrunner extends AbstractTestNGCucumberTests {
}
