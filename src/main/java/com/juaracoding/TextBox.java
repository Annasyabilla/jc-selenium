package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/15/2024 3:04 AM
@Last Modified 10/15/2024 3:04 AM
Version 1.0
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\MyTools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //membuka driver
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize(); //untuk full screen
        System.out.println("Open browser");
        driver.get("https://demoqa.com/text-box"); //link menuju web

        //locator BY ID
        driver.findElement(By.id("userName")).sendKeys("juaracoding"); //sendkey untuk mengetik
        driver.findElement(By.id("userEmail")).sendKeys("nanana@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("JL JALAN AJA");

        //scroll vertical 800px
        js.executeScript("window.scrollBy(0,800)",""); //0 horizontal

        driver.findElement(By.id("permanentAddress")).sendKeys("JL PERMANENT");
        driver.findElement(By.id("submit")).click(); //klik button

        try { //memberikan jeda
            Thread.sleep(2000); //2000 = 2 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); //close driver, all tab
        System.out.println("Quit browser");
    }
}
