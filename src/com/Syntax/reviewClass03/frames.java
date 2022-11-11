package com.Syntax.reviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the demoqa Alerts
        driver.get("https://chercher.tech/practice/frames");

//        switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
//        switch the focus to the child frame
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

//        switch the focus back to home content
          driver.switchTo().defaultContent();

//          switching to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

//        find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel= new Select(dropDown);

        sel.selectByIndex(1);


        driver.switchTo().defaultContent();


        driver.switchTo().frame("frame1");

        driver.findElement(By.xpath("//input")).sendKeys("abracdabra");

    }
}
