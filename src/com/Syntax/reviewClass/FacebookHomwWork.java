package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomwWork {
    public static void main(String[] args) throws InterruptedException {
//       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the facebook
        driver.get("https://www.facebook.com/");
//        maximize the window
        driver.manage().window().maximize();

//        click on create new account
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//sleep time for the new window to load
        Thread.sleep(3000);
//        send the first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("zameer");
// send the last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zombiee");
//        close the window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zG')]")).click();

//        before closing wait for some time
        Thread.sleep(5000);
//     quit the browser
        driver.quit();



    }
}
