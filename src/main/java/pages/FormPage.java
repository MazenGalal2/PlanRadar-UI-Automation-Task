package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormPage {

        WebDriver driver;
        private By createNewFormButton = By.xpath("/html/body/div[1]/div/div[4]/div/div[3]/div[2]/div/div/div[1]/div/div[1]/button/span/div");

        public FormPage (WebDriver driver)
{

            this.driver = driver;

        }

        public void clickonCreateNewFormButton () {


            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(createNewFormButton));
            driver.findElement(createNewFormButton).click();

        }
}
