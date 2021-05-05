package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.krb5.internal.KdcErrException;

public class HW2Alert {
    /*
    Go to
    http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php

click on each button and handle the alert accordingly
     */
    static String url="http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement alertButton= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertButton.click();
        Thread.sleep(1000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();

        WebElement confirmButton= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmButton.click();
        Thread.sleep(1000);
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.dismiss();

        WebElement promptButton=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptButton.click();
        Thread.sleep(1000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("John");
        promptAlert.accept();
    }
}
