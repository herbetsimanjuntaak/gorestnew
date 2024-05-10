package stepdef;

import io.cucumber.java.en.And;
import pages.UpdatePage;

public class UpdateStep {

    UpdatePage updatePage = new UpdatePage();


    @And("hit API update user by id")
    public void hitGetAPIUpdateUserById() {
        updatePage.hitAPIUpdateUser();
    }

    @And("prepare update id {int}")
    public void prepareUpdateId(int id) {
        updatePage.setUpdateId(id);
    }
}
