package tests;

import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.SigninPage;

public class DashBoardTest extends BaseTest
{

    @Test

    public void dashBoardTest()
    {

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.clickonformsandListsButton();

    }
}
