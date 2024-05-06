package tests;
import org.testng.annotations.Test;
import pages.CreateNewFormPage;


public class CreatNewFormTest extends BaseTest{

    @Test

    public void createNewFormTest()
    {

        CreateNewFormPage createNewFormPage = new CreateNewFormPage(driver);
        //createNewFormPage.setFormNameField();
        //createNewFormPage.setFormDescriptionField();
        createNewFormPage.clickonPriorityField();
        createNewFormPage.clickonStatusField();
        createNewFormPage.setStatusDescriptionField();
        createNewFormPage.clickonSaveButton();
    }
}
