package tests;

import org.testng.annotations.Test;
import pages.FormPage;

public class FormTest extends BaseTest

{

    @Test

    public void formTest()
    {

        FormPage formPage = new FormPage(driver);
        formPage.clickonCreateNewFormButton();
    }
}
