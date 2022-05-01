package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //feature we use to provide the path of all the feture
        features = "src/test/resources/features/Login.feature",
        //glue is where we find implementation for gherkin steps
        //we provide the path of package to get all step definitions
        glue = "steps",
        //dryrun we use to step definitions of undefined steps
        //if we set it Ture, it will quickely scan all Gherkin steps weather they are implemented or not
        //if we set it true, it stop actual execution
        //to execute scripts in real time, we should set it this value to False

        dryRun = false,
        //it means the consol output for cucumber test is having irrelevant information
        //when we set it to True, it simply remove all the irrelevant information
        monochrome = true,
        //with "Or" it can be in different scenario
        //With "and" it must be in same scenario
        tags = "@smoke"

)

public class Smoke {
}
