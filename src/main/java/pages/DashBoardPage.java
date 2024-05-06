package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {

    WebDriver driver;
    private By formsandListsLink = By.xpath("//a[@data-id=\"navigation_formsandlists\"]");

    public DashBoardPage(WebDriver driver) {

        this.driver=driver;

    }

    public void clickonformsandListsButton () {


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(formsandListsLink));
        driver.findElement(formsandListsLink).click();

    }
}


