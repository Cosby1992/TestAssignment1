package dk.cosby.cph.test.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/TemperatureConverter.feature"},
        glue = {"dk/cosby/cph/test/cucumber"})
public class RunCucumberTest {
}
