package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement nameBox= driver.findElement(By.id("name"));
        nameBox.sendKeys("John");
        driver.switchTo().defaultContent();
//        WebElement alertButton= driver.findElement(By.id("alert"));
//        alertButton.click();

        driver.switchTo().frame("iframe_a");
        nameBox.clear();
        nameBox.sendKeys("Smith");
        driver.switchTo().defaultContent();

        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(iframeElement);
        nameBox.clear();
        nameBox.sendKeys("Rocks");



    }
}