package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*Open chrome browser
    Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify Syntax Logo is displayed.*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userNameTextBox= driver.findElement(By.cssSelector("input#txtUsername"));
        userNameTextBox.sendKeys("Admin");
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input#txtPassword"));
        passwordTextBox.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.cssSelector("input[type ^='sub']"));
        loginButton.click();
        WebElement syntaxLogo=driver.findElement(By.cssSelector("img[src *='syntax']"));
        if(syntaxLogo.isDisplayed()){
            System.out.println("Syntax Logo is displayed");
        }
        driver.quit();



    }
}
