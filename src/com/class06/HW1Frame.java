package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Frame {
    /*
    Navigate to
    http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is
displayed verify enroll today button is enabled
     */
    static String url="http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement header=driver.findElement(By.cssSelector("span.gum"));
        System.out.println("Header is "+header.isDisplayed());
        Thread.sleep(2000);
        driver.switchTo().frame("FrameTwo");
        WebElement enrollButton= driver.findElement(By.cssSelector("a.enroll-btn"));
        System.out.println("Enroll Button is "+enrollButton.isEnabled());
    }

}
