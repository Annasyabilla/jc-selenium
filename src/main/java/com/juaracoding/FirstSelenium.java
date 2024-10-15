package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","C:\\MyTools\\chromedriver.exe");
         WebDriver driver = new ChromeDriver(); //membuka driver
         driver.get("https://www.google.com"); //link menuju web

        //locator name
//        driver.findElement(By.name("q")).sendKeys("Selenium"); //sendkey untuk mengetik
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //menggunakan cara enter

        //locator link text <a>Gmail</a>
        driver.findElement(By.linkText("Gmail")).click();

        try { //memberikan jeda
            Thread.sleep(2000); //2000 = 2 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); //close driver, all tab

    }
}