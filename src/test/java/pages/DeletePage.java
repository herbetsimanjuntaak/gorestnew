package pages;

import static helper.Models.deleteUserById;

public class DeletePage extends ApiPage{

    GetPage getPage = new GetPage();


    public void hitGetAPIDeleteUserById() {

        System.out.println(getPage.finalID);
        response = deleteUserById(getPage.finalID);
    }
}
