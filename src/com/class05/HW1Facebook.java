package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1Facebook {
    /*
    Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */
    static String url="http://facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createAccountButton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccountButton.click();
        Thread.sleep(1000);
        WebElement monthDD=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectMonth=new Select(monthDD);
        List<WebElement> monthOptions= selectMonth.getOptions();
        int monthSize=monthOptions.size();
        System.out.println(monthSize);

        WebElement dayDD= driver.findElement(By.cssSelector("select#day"));
        Select selectDay=new Select(dayDD);
        List<WebElement> dayOptions=selectDay.getOptions();
        int daySize=dayOptions.size();
        System.out.println(daySize);

        WebElement yearDD=driver.findElement(By.xpath("//select[@title='Year']"));
        Select selectYear=new Select(yearDD);
        List<WebElement> yearOptions=selectYear.getOptions();
        int yearSize= yearOptions.size();
        System.out.println(yearSize);

        selectMonth.selectByVisibleText("Mar");
        selectDay.selectByIndex(7);
        selectYear.selectByValue("1969");

        driver.quit();

    }
}
