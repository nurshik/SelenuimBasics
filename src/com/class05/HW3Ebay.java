package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW3Ebay {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    static String url="http://ebay.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement searchCats= driver.findElement(By.xpath("//select"));
        Select select=new Select(searchCats);
        List<WebElement> searchList= select.getOptions();
        for(WebElement searchItems:searchList){
            String searchItemsValue= searchItems.getText();
            System.out.println(searchItemsValue);
            if(searchItemsValue.equals("Computers/Tablets & Networking")){
                searchItems.click();
                break;
            }
        }
        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Search']"));
        searchButton.click();
        WebElement header= driver.findElement(By.cssSelector("span.b-pageheader__text"));
        boolean headerIsDisplayed= header.isDisplayed();
        System.out.println(headerIsDisplayed);

    }
}
