package com.Syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

//        find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(2000);
//       Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

//        find the button for confirmation alert and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

//        find the prompt alert and send some text then accept it

        WebElement propmptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        propmptAlert.click();

//        switch the focus to the alert
        Alert propm1 = driver.switchTo().alert();
        propm1.sendKeys("abracadabra");
        propm1.accept();



    }
}
