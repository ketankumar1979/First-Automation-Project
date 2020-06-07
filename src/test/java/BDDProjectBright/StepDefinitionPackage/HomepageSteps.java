package BDDProjectBright.StepDefinitionPackage;

import BDDProjectBright.PageObjectPackage.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps {

    Homepage homepage = new Homepage();

    @Given("^user is on the homepage of argos website$")
    public void user_is_on_the_homepage_of_argos_website() throws Throwable {
        homepage.homePageURL();
    }

    @When("^user wants to search for product$")
    public void user_wants_to_search_for_product() throws Throwable {
        homepage.doSearch("nike");

    }

    @Then("^user should see all the relavent searched products\\.$")
    public void user_should_see_all_the_relavent_searched_products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user clicks on the account button$")
    public void userClicksOnTheAccountButton() {
   homepage.clickOnAccountButton();

    }


    @Then("^user should able to see all the detail of account$")
    public void userShouldAbleToSeeAllTheDetailOfAccount() {
    }

    @When("^user try to find multiple \"([^\"]*)\"$")
    public void userTryToFindMultiple(String item) throws Throwable {
     homepage.doSearch(item);
    }
}
