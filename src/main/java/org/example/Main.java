package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
//String googlepagesource = driver.getPageSource();
            //System.out.println("google page source is " + googlepagesource);
            String googlehandle = driver.getWindowHandle();
            System.out.println("Google Handle is " + googlehandle);
            //String googletitle = driver.getTitle();
        /* System.out.println("Google title is " + googletitle);
        driver.navigate().to("https://www.udemy.com");
        String udemytitle = driver.getTitle();
        System.out.println("udemy title is " + udemytitle);
String udemyurl = driver.getCurrentUrl();
System.out.println("Udemy url is " + udemyurl);

driver.navigate().back();
driver.getCurrentUrl();
String googleurl = driver.getCurrentUrl();
System.out.println("Google url is " + googleurl);

driver.navigate().refresh();
googleurl = driver.getCurrentUrl();
System.out.println("Google url is " + googleurl);

driver.navigate().forward();
udemyurl = driver.getCurrentUrl();
System.out.println("Udemy url is " + udemyurl);

//Thread.sleep(3000);
*/
            driver.close();

    }
}