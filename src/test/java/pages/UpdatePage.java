package pages;



import static helper.Models.*;
public class UpdatePage extends ApiPage{

    //GetPage getPage = new GetPage(); //class update page memiliki atribut getPage


    public void setUpdateId(int id) {
        System.out.println(setUrl+" set");
        finalID = setUrl+"/"+id;
        System.out.println(finalID+ " id");
    }
    public void hitAPIUpdateUser() {
//        System.out.println(getPage.setUrl);
//        String finalID = getPage.finalID;
        System.out.println("Final ID di OtherClass: " + finalID);
        response = hitUpdate(finalID);

    }
}
