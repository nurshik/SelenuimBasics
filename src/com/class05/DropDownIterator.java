package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class DropDownIterator {
    static String url = "http://amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categoriesDD);
        boolean isMult= select.isMultiple();
        if(!isMult){
            List<WebElement> options= select.getOptions();
            Iterator<WebElement> iterator= options.iterator();
            while(iterator.hasNext()){
                WebElement ddOption= iterator.next();
                String optionText= ddOption.getText();
                System.out.println(optionText);
            }
        }
    }
}
