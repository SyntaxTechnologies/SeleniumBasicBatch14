package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto smart bear .com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//        maximize the window
        driver.manage().window().maximize();
//        Enter the user Name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

//       /enter the Password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        click login
        driver.findElement(By.className("button")).click();

//        Make sure that the title is correct i.e   Web Orders


//        get the title of the page
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The Title is correct :"+ title);
        }
        else{
            System.out.println("The title is incorrect :"+title);
        }



    }
}
