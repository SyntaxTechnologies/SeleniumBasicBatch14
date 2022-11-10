package com.Syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

//        task : goto gmail signup and get the window handle

//        goto gmail signup page
        driver.get("http://accounts.google.com/signup");

//        get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();

//        print
        System.out.println("the handle of the current page is :"+gmailHandle);


    }
}
