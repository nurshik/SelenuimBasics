package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    static String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageWindowHandle= driver.getWindowHandle();
        WebElement instagramButton= driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndFBButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instagramButton.click();
        facebookButton.click();
        instaAndFBButton.click();

        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator= allWindowHandles.iterator();
        while(iterator.hasNext()){
            String handle=iterator.next();
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }
    }
}