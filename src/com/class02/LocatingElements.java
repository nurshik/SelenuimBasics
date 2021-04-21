package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("syntax");
        driver.findElement(By.id("pass")).sendKeys("syntax123");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
