package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://syntaxtechs.com/selenium-practice/index.php");
        WebElement startPracticebutton=driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticebutton.click();
        Thread.sleep(1000);
        WebElement simpleFromDemo=driver.findElement(By.xpath("(//a[text()= 'Simple Form Demo'])[2]"));
        simpleFromDemo.click();
        WebElement messageTextBox=driver.findElement(By.cssSelector("input[placeholder ^='Please enter']"));
        messageTextBox.sendKeys("Bla bla");
        WebElement showMessage=driver.findElement(By.cssSelector("button[onclick *='show']"));
        showMessage.click();
    }
}
