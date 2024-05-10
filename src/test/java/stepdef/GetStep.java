package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GetPage;


public class GetStep {
    public GetStep() {
        this.getPage = new GetPage();
    }

    GetPage getPage;


    @Given("prepare url for {string}")
    public void prepareUrlFor(String endpoint) {
        getPage.setUpUrl(endpoint);
    }


    @And("hit API get list users")
    public void hitAPIGetListUsers() {
        getPage.hitAPIGetListUsers();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int statusCode) {
        getPage.validationStatusCode(statusCode);
    }


    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        getPage.validationResponseBody();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String json) {
        getPage.validationResponseJson(json);
    }


    @And("prepare valid id {int}")
    public void prepareValidId(int id) {
        getPage.prepareValidId(id);
    }

    @And("hit API get user by id")
    public void hitAPIGetUserById() {
        getPage.hitAPIGetUser();
        
    }


    @Then("validation response body get user by id")
    public void validationResponseBodyGetUserById() {
        getPage.validationResponseBodyGetUserById();
    }
}
