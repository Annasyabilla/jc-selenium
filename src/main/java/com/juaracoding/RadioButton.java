package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/15/2024 4:35 AM
@Last Modified 10/15/2024 4:35 AM
Version 1.0
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\MyTools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //membuka driver
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize(); //untuk full screen
        System.out.println("Open browser");
        driver.get("https://demoqa.com/radio-button"); //link menuju web

        //locator
        driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div:nth-child(3) > div:nth-child(2) > label")).click();
        driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div:nth-child(3) > div:nth-child(3) > label")).click();

        try { //memberikan jeda
            Thread.sleep(2000); //2000 = 2 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); //close driver, all tab
        System.out.println("Quit browser");
    }
}
