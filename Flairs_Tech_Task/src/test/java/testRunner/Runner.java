package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/features",
        glue =    {"org.example.stepDefs"},
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"},
        tags = "@smoke"
)
public class Runner {
}
