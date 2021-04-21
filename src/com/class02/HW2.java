package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath(("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")));
        firstName.sendKeys("John");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("johnsmith123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johnsmith123@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456");
        driver.findElement(By.name("websubmit")).click();


    }
}
