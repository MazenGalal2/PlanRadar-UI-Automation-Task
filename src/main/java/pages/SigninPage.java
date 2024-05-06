package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SigninPage {

    WebDriver driver;

private By emailField = By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div/div/form/div[1]/div/input");

private By continueButton = By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div/div/form/button");

private By passwordField = By.id("password");

private By loginButton = By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div/div/form/button");

    public SigninPage(WebDriver driver) {

        this.driver=driver;

    }
    public void setEmailField () {

        //driver.findElement(emailField).sendKeys("memogalal62@gmail.com");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).sendKeys("memogalal62@gmail.com");

    }

    public void clickonContinueButton () {

        driver.findElement(continueButton).click();


    }

    public void setPasswordField () {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        driver.findElement(passwordField).sendKeys("1478963");

    }

    public void clickLoginButton () {

        driver.findElement(loginButton).click();
    }

}
