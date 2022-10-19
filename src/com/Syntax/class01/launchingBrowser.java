package com.Syntax.class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        use the get() function to open up the required website
        driver.get("https://www.google.com/");
//        get the url of the website
        String  url=driver.getCurrentUrl();
//        print the url
        System.out.println(url);

//        get the title
        String title=driver.getTitle();
//        print the title
        System.out.println(title);
//        close the chrome
        driver.quit();


    }
}

//8:45