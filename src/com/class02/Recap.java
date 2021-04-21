package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign up")){
            System.out.println("Title is right");
        }   else{
            System.out.println("Title is wrong");
        }
        driver.quit();

    }
}
