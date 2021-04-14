package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");

        WebDriver driver=new ChromeDriver();// launch the browser
        driver.get("https://www.google.com/");// navigate to specific url
        String url=driver.getCurrentUrl();//get current url
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
