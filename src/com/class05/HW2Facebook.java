package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2Facebook {
    /*
    Go to facebook sign up page
Fill out the whole form
Click signup
     */
    static String url="http://facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createNewAccountButton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccountButton.click();
        Thread.sleep(1000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");
        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("johnsmith@gmail.com");
        Thread.sleep(1000);
        WebElement emailConfirm= driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirm.sendKeys("johnsmith@gmail.com");
        WebElement password=driver.findElement(By.cssSelector("input#password_step_input"));
        password.sendKeys("password1234");
        WebElement monthDD= driver.findElement(By.id("month"));
        Select selectMonth=new Select(monthDD);
        selectMonth.selectByVisibleText("Mar");
        WebElement dayDD= driver.findElement(By.xpath("//select[contains(@title, 'Day')]"));
        Select selectDay=new Select(dayDD);
        selectDay.selectByIndex(7);
        WebElement yearDD=driver.findElement(By.xpath("//select[@title='Year']"));
        Select selectYear=new Select(yearDD);
        selectYear.selectByValue("1969");
        List<WebElement> sexRadioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement sexRadioButton:sexRadioButtons
             ) {
            String radioButtonValue=sexRadioButton.getAttribute("value");
            if(radioButtonValue.equals("2")){
            sexRadioButton.click();
            break;
        }
        }
        WebElement signUpButton= driver.findElement(By.name("websubmit"));
        signUpButton.click();
    }
}
