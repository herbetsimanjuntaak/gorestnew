package pages;


import io.restassured.path.json.JsonPath;

import static helper.Models.createNewUser;
import static org.assertj.core.api.Assertions.assertThat;

public class CreatePage extends GetPage {

    public void hitAPICreateNewUsers() {
        response = createNewUser(setUrl);
    }
    public void validationResponseBodyCreateNewUser() {
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
