package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    static String url="http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //Alert button
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(1000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        //Confirm alert
        WebElement confirmAlertButton=driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(1000);
        Alert confirmAlert=driver.switchTo().alert();
        String alertText=confirmAlert.getText();
        Thread.sleep(1000);
        System.out.println(alertText);
        confirmAlert.dismiss();
        //Prompt alert
        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(1000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("John");
        Thread.sleep(1000);
        promptAlert.accept();


    }
}
