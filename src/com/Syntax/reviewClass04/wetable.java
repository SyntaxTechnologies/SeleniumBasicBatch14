package com.Syntax.reviewClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class wetable {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();
        //find our desired column
        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        //traverse trough our column
        for (int i = 0; i < idColumn.size(); i++) {
            String idColumnTxt = idColumn.get(i).getText();
            //check for the desired value //our desired ID is 44967A
            if (idColumnTxt.equalsIgnoreCase("45030A")) {
                int rowNumber = i + 1;
                //get the checkbox on this row number and click it
                WebElement checkBox2 = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + rowNumber + "]/td[1]"));

                checkBox2.click();
                break;
            }

        }

    }
}