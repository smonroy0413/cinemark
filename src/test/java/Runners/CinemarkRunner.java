package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/Feature/Login.feature"},
        glue = "",
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        tags = {"@r"}
)

public class CinemarkRunner {
}
