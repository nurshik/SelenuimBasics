package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDropDown {
    static String url="http://amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categoriesDD);
        System.out.println(select.isMultiple());
        List<WebElement> options= select.getOptions();
        /*for (WebElement option:options
             ) {
            String optionText=option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias=alexa-skills");*/
        Iterator<WebElement> iterator= options.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
