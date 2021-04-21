package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Any St");
        driver.findElement(By.name("customer.address.city")).sendKeys("AnyCity");
        driver.findElement(By.name("customer.address.state")).sendKeys("AnyState");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("987654321");
        driver.findElement(By.name("customer.username")).sendKeys("User123");
        driver.findElement(By.id("customer.password")).sendKeys("UserLoser");
        driver.findElement(By.id("repeatedPassword")).sendKeys("UserLoser");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        driver.quit();
    }
}