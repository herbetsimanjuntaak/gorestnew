package pages;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import java.io.File;
import java.util.List;
import static helper.Models.*;
import static helper.Utility.getJSONSchemaFile;
import static org.assertj.core.api.Assertions.assertThat;

public class GetPage extends ApiPage {


    public void hitAPIGetListUsers() {
        System.out.println(setUrl);
        response = getListUsers(setUrl);
    }

    public void validationStatusCode(int statusCode) {
        assertThat(response.statusCode()).isEqualTo(statusCode);
    }

    public void validationResponseBody() {
        List<Object> id = response.jsonPath().getList("id");
        List<Object> name = response.jsonPath().getList("name");
        List<Object> email = response.jsonPath().getList("email");
        List<Object> gender = response.jsonPath().getList("gender");
        List<Object> status = response.jsonPath().getList("status");

        assertThat(id.get(0)).isNotNull();
        assertThat(name.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(gender.get(0)).isIn("female", "male");
        assertThat(status.get(0)).isIn("active", "inactive");
        System.out.println(response.getBody().asString());

    }

    public void validationResponseJson(String json) {
        File JSONFile = getJSONSchemaFile(json);
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void prepareValidId(int id) {
        finalID = setUrl+"/"+id;
        System.out.println(finalID+ " id");
    }

    public void hitAPIGetUser() {
        response = getUser(finalID);
        System.out.println(response.getBody().asString());

    }

    public void validationResponseBodyGetUserById() {

        JsonPath jsonPathEvaluator = response.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");
        assertThat(status).isIn("active", "inactive");

    }

}
