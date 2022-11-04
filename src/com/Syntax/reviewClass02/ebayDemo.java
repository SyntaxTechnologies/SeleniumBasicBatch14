package com.Syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebayDemo {
    public static void main(String[] args) {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver = new ChromeDriver();
//        open the ebay
        driver.get("https://www.ebay.com/");
//        select from the drop down
        WebElement dropDwn = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel= new Select(dropDwn);

        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        verify the title


        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("the title is verified");
        }
        else{
            System.out.println("the title is incorrect");
        }

    }
}
