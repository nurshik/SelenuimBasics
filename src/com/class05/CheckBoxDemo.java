package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedList;
import java.util.List;

public class CheckBoxDemo {
    static String url="http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        System.out.println(checkBoxes.size());
        for (WebElement checkbox:checkBoxes
             ) {
            String checkBoxValue=checkbox.getAttribute("value");
            if(checkBoxValue.equalsIgnoreCase("Option-2")){
                checkbox.click();
                break;
            }
            //Thread.sleep(1000);
        }

    }
}
