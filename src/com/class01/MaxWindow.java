package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();//maximizes actual window
        //driver.manage().window().fullscreen();//shows fullscreen without tabs
        driver.navigate().back();
    }
}
