package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty",
                "html:target/html-reports/cucumber-report.html",
                 "json:target/json-reports/json-report.json",
        "rerun:target/rerun.txt"},
        features ="src/test/resources/features",
        glue = "io/loop/step_definitions",
        dryRun = true,
        tags = " ",
        monochrome = true

)
public class CukesRunner {


}
