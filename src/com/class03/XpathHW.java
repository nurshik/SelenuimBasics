package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://syntaxtechs.com/selenium-practice/index.php");
        WebElement startPractice=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPractice.click();
        Thread.sleep(1000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Simple Form Demo']"));
        simpleFormDemo.click();
        WebElement userMessage=driver.findElement(By.xpath("//input[@id='user-message']"));
        userMessage.sendKeys("TestMessage");
        WebElement sendMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        sendMessage.click();
        driver.quit();



    }
}
