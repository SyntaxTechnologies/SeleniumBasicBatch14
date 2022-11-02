package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

//        get the webElment text box
//        driver.findElement(By.cssSelector("input[placeholder *= 'Please enter']")).sendKeys("Abracadbara");

//        another method of doing the above operation
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder *= 'Please enter']"));
        textBox.sendKeys("abracadbra");

//        press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
        button.click();

    }
}
