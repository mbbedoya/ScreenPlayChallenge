package co.com.accenture.automation.screenplaychallenge.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        tags= {"@FirstScenario,@SecondScenario","~@ThirdScenario"},
        glue="co.com.accenture.automation.screenplaychallenge.stepdenitions",
        snippets=SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        plugin = {"json:reportJson/cucumber.json"})

public class BancolombiaSimulationRunner {}

