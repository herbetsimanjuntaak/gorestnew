package stepdef;

import io.cucumber.java.en.And;
import pages.DeletePage;

public class DeleteStep {
    DeletePage deletePage = new DeletePage();

    @And("hit get API delete user by id")
    public void hitGetAPIDeleteUserById() {
        deletePage.hitGetAPIDeleteUserById();

    }
}
