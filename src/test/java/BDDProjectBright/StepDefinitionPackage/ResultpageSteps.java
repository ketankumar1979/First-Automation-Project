package BDDProjectBright.StepDefinitionPackage;

import BDDProjectBright.PageObjectPackage.Homepage;
import BDDProjectBright.PageObjectPackage.Resultpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultpageSteps {

    Resultpage resultpage = new Resultpage();
    Homepage homepage = new Homepage();

    @Given("^user is on the result page of the argos website$")
    public void user_is_on_the_result_page_of_the_argos_website() throws Throwable {

    }

    @When("^user clicks on the Running filter$")
    public void user_clicks_on_the_Running_filter() throws Throwable {
        resultpage.runningFilter();
    }

    @Then("^user should see all the products associated with running filter$")
    public void user_should_see_all_the_products_associated_with_running_filter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
