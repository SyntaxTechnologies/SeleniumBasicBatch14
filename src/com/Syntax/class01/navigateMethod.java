package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
//        goto google.com
//        goto fb.com
//        go back to google.com
//
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create the Webdriver instance
        WebDriver driver=new ChromeDriver();
//        goto google.com
        driver.get("https://www.google.com");
//  goto facebook.com
        driver.navigate().to("https://www.facebook.com/");

//        introduce some sleep which is wait
//        wait or pause for 2000 milli seconds (2 sec)
        Thread.sleep(2000);
//        go back to google .com
        driver.navigate().back();

//        wait for 2 seconds
        Thread.sleep(2000);
//        go back to fb.com
        driver.navigate().forward();

//        wait for 1 sec
        Thread.sleep(1000);
//        refresh the page
        driver.navigate().refresh();
//      quit
        driver.quit();

    }
}
