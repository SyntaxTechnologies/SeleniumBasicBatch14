package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

// find the webElement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
//        get the text from the btn webelement
        String text = btn.getText();
//        print it on console
        System.out.println("the text in the button is :"+text);


//        get the value of the attribute "id" from this WebElement
        String idvalue = btn.getAttribute("id");
//        print it on the console
        System.out.println("the value of the attribute id is :"+idvalue);

    }
}
