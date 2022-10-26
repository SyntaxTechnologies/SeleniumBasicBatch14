package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
//got to Fb.com
// Enter Username
// Enter password
// click login
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto fb.com
        driver.get("https://www.facebook.com/");
//        maximize the window
        driver.manage().window().maximize();
//        enter the Username in the TextBOX
            //         1.locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abracadbara");
//        enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("waow12345678");
//        click the login
        driver.findElement(By.name("login")).click();

//        for the following task to work please make sure that you comment the Login functionality

//        task2:
//        click on forgot password using linkText locator
//        driver.findElement(By.linkText("Forgotten password?")).click();

//        for the following task to work please make sure to comment the task2 and login funcitonality

//        task3:
        //        click on forgot password using Partial linkText locator

//        driver.findElement(By.partialLinkText("Forgotten ")).click();

    }
}
