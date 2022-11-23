package com.Syntax.Test;

import com.Syntax.Pages.loginPage;
import com.Syntax.utlis.CommonMethods;

public class loginPageTest {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPage login =new loginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();


    }

}
