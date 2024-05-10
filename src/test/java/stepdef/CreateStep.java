package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CreatePage;

public class CreateStep {
    CreatePage createPage = new CreatePage();

    @Given("prepare url for  {string}")
    public void prepareUrlFor(String arg0) {
        createPage.setUpUrl(arg0);
    }

    @And("hit API create new users")
    public void hitAPICreateNewUsers() {
        createPage.hitAPICreateNewUsers();

    }

    @Then("validation response body get create new user")
    public void validationResponseBodyGetCreateNewUser() {
        createPage.validationResponseBodyCreateNewUser();
    }


    @Then("validation status code is equal {int}")
    public void validationStatusCodeIsEqual(int arg0) {
        createPage.validationStatusCode(arg0);
    }

    @Then("validation response json with JSONSchema  {string}")
    public void validationResponseJsonWithJSONSchema(String arg0) {
        createPage.validationResponseJson(arg0);
    }
}
