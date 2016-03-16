package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ilievi on 16.03.2016.
 */
public class FirstStepDefs {


    Belly belly;

    @Given("^I have (\\d+) cukes$")
    public void givenIHaveCukes(Integer cukes) {
        belly = new Belly();
        belly.feed(cukes);
    }

    @When("^I subtract (\\d+)$")
    public void whenIsubtract(Integer cukes) {
        belly.subtract(cukes);
    }

    @Then("^I remain with (\\d+) cukes$")
    public void thenIremainWith(Integer remainingCukes) {
        assertThat(remainingCukes, is(belly.getCukes()));
    }


}
