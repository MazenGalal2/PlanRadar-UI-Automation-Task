package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateNewFormPage {

    WebDriver driver;

    private By formNameField = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/p");
    private By formDescriptionField = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p");
    private By statusField = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]");
    private By priorityField = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div/div[3]");
    private By statusDescriptionField = By.xpath("/html/body/div[3]/div/div[2]/div/aside/div/div[1]/div/div[2]/div/textarea");
    private By saveButton = By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/button[1]/span/div");


    public CreateNewFormPage (WebDriver driver)
    {

        this.driver = driver;

    }


    public void setFormNameField () {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(formNameField));

        driver.findElement(formNameField).sendKeys("Trial 2");

    }

    public void setFormDescriptionField () {

        driver.findElement(formDescriptionField).sendKeys("This is a Trial");

    }

    public void clickonStatusField() {

        driver.findElement(statusField).click();

    }

    public void clickonPriorityField() {

        driver.findElement(priorityField).click();

    }

    public void setStatusDescriptionField () {

        driver.findElement(statusDescriptionField).sendKeys("Hi All");

    }

    public void clickonSaveButton() {

        driver.findElement(saveButton).sendKeys("Hi All");

    }

}
