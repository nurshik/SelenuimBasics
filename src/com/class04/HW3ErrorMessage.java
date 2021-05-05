package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3ErrorMessage {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userNameTextBox= driver.findElement(By.cssSelector("input#txtUsername"));
        userNameTextBox.sendKeys("Admin");
        WebElement loginButton=driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();
        WebElement errorMessage=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        if(errorMessage.isDisplayed()){
            System.out.println("Error message is displayed");
        }
        driver.quit();
    }
}
