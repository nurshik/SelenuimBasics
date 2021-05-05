package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HW2Amazon {
    /*
    Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        for(int i=0;i< allLinks.size();i++) {

            String linkText=allLinks.get(i).getText();
            String linkValue=allLinks.get(i).getAttribute("href");
            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+linkValue);
            }

        }
    }
}



