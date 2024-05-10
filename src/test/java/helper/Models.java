package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import static helper.Utility.*;


public class Models {

    private static RequestSpecification requestSpecification;

    public static void setUpHeaders() {
        requestSpecification = RestAssured.given().header("Content-Type", "application/json").header("Accept", "application/json").header("Authorization", "Bearer 2259048ef8b50ff36a730b1d6dcd5962cd3c9aa5210a7b4ca68b92c36d8abfc9");
    }

    public static Response getListUsers(String endpoint) {
        setUpHeaders();
        return requestSpecification.when().get(endpoint);
    }

    public static Response getUser(String endpoint) {
        setUpHeaders();
        return requestSpecification.when().get(endpoint);
    }



    public static Response createNewUser(String endpoint) {
        String name = generateName();
        String gender = "female";
        String email = generateEmails();
        System.out.println(email);
        String status = "active";
        System.out.println(endpoint);

        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);
        setUpHeaders();
        return requestSpecification.body(payload.toString()).when().post(endpoint);

    }

    public static Response hitUpdate(String endpoint ) {

        String name = generateName()+" Edit";
        String email = generateEmails();
        String status = "active";
        String gender = "male";


        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("email", email);
        payload.put("status", status);
        payload.put("gender", gender);

        setUpHeaders();
        return requestSpecification.body(payload.toString()).when().put(endpoint);
    }

    public static Response deleteUserById(String endpoint ) {
        setUpHeaders();

        return requestSpecification.when().delete(endpoint);
    }
}
