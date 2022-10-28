package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {

        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the syntax
        driver.get("https://syntaxprojects.com/");
//        maximize the window
        driver.manage().window().maximize();
// click on start practicing
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();


//        comment out either method 1 or method 2 , u can not use them at the same time
//        becuase they are clicking on the same button
  Thread.sleep(3000);
//  method1      click on demo using indexing
   driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();
//            or

//    method 2     click on demo using and operator in the xpath
//        driver.findElement(By.xpath("//a[@class='list-group-item'and @href='basic-first-form-demo.php']")).click();


    }
}
