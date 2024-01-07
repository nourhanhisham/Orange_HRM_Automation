package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFiles/"}
        , glue = {"StepDefinition"}
        , tags = "@Add_and_delete_users"

)

public class TestRunner {

}
