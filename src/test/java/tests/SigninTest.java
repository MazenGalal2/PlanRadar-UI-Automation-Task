package tests;

import org.testng.annotations.Test;
import pages.SigninPage;

public class SigninTest extends BaseTest {

    @Test

    public void signinTest(){

        SigninPage signinPage = new SigninPage(BaseTest.driver);
        signinPage.setEmailField();
        signinPage.clickonContinueButton();
        signinPage.setPasswordField();
        signinPage.clickLoginButton();

    }

}
