package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto fb.com
        driver.get("https://www.facebook.com/");
//        enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");

//        click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

    }
}
