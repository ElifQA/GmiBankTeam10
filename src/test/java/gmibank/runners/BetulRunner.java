package gmibank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(strict = true,

        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "/Users/Betul/IdeaProjects/GmiBankTeam10/src/test/resources",
        glue = "gmibank/stepdefinitions",
        tags = "@US_18TC09",
        dryRun = false
)

public class BetulRunner {
}
