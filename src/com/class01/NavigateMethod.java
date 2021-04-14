package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");//will wait for whole page to load, won't keep the history of your browser
        driver.navigate().to("https://google.com");//will not wait for whole page to load, but will keep history of your browser
        Thread.sleep(1000);// pause in execution in milliseconds
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.quit();// will quit the whole browser
        driver.close();// will close the current tab
    }
}
