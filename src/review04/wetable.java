package review04;

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
//        code to get to the table page
        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button= driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton= driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList= driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();


//        get a particular id  44969A and check the checkBox

        List<WebElement> listofID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

//        traverese

        for (int i=0;i< listofID.size();i++){

            String id = listofID.get(i).getText();

                if(id.equalsIgnoreCase("44969A") ){
                    System.out.println(i);
//                    check the checkBox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[1]"));
                    checkBox.click();
                    break;
                }
        }





    }
}
