package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    private By signinButton = By.xpath("//a[@class='login-btn bordered-btn d-none d-md-block d-xl-none']");

    private By cookiesAcceptance = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span");
    public HomePage(WebDriver driver) {

        this.driver=driver;

    }

    public void clickCookiesAcceptance () {

        driver.findElement(cookiesAcceptance).click();
    }
public void clickSigninButton () {

    //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("fa-stack-1x")));
      //  driver.findElement(signinButton).click();

    WebElement boardMenu = this.driver.findElement(signinButton);
    Actions action = new Actions(this.driver);

    action.moveToElement(boardMenu).perform();

    }

}
