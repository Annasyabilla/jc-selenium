package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/15/2024 5:07 PM
@Last Modified 10/15/2024 5:07 PM
Version 1.0
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\MyTools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //membuka driver
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize(); //untuk full screen
        System.out.println("Open browser");
        driver.get("https://demoqa.com/webtables"); //link menuju web

        //scroll vertical 500px
        js.executeScript("window.scrollBy(0,500)",""); //0 horizontal

        //klik button add
        driver.findElement(By.id("addNewRecordButton")).click();
        //isi field
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Smith");
        driver.findElement(By.id("userEmail")).sendKeys("john.smith@gmail.com");
        driver.findElement(By.id("age")).sendKeys("34");
        driver.findElement(By.id("salary")).sendKeys("1200000");
        driver.findElement(By.id("department")).sendKeys("QA");
        driver.findElement(By.id("submit")).click();

        //fitur edit
        driver.findElement(By.cssSelector("#edit-record-2 > svg")).click();
        driver.findElement(By.id("firstName")).sendKeys("Aiden");
        driver.findElement(By.id("lastName")).sendKeys("Smith");
        driver.findElement(By.id("submit")).click();

        //fitus hapus
        driver.findElement(By.cssSelector("#delete-record-1 > svg")).click();

        //fitur search
        driver.findElement(By.id("searchBox")).sendKeys("Vega");

        try { //memberikan jeda
            Thread.sleep(2000); //2000 = 2 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); //close driver, all tab
        System.out.println("Quit browser");
    }
}
