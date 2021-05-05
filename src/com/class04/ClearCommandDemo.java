package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userNameTextBox.sendKeys("Tester");
        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwordTextBox.sendKeys("test");

        userNameTextBox.clear();
        passwordTextBox.clear();


    }
}
