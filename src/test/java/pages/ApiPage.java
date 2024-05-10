package pages;

import helper.Endpoint;
import io.restassured.response.Response;

public class ApiPage {
    public String setUrl,finalID;
    public Response response;


    public void setUpUrl(String url) {
        switch (url) {
            case "CREATE_NEW_USERS":
                setUrl = Endpoint.CREATE_NEW_USERS;
                break;
            case "GET_LIST_USERS":
                setUrl = Endpoint.GET_LIST_USERS;
                break;
            case "DELETE_USERS":
                setUrl = Endpoint.DELETE_USERS;
                break;
            case "POST_USERS":
                setUrl = Endpoint.POST_USERS;
                break;
            case "PATCH_USERS":
                setUrl = Endpoint.PATCH_USERS;
                break;
            case "PUT_USERS":
                setUrl = Endpoint.PUT_USERS;
                break;
            case "GET_ENDPOINT_WRONG":
                setUrl = Endpoint.GET_ENDPOINT_WRONG;
                break;
            case "GET_LIST_USER_BY_ID":
                setUrl = Endpoint.GET_LIST_USER_BY_ID;
                break;
            default:
                System.out.println("input valid url :)");
        }
        System.out.println(setUrl);
    }
}
