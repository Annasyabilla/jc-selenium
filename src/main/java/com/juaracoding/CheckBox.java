package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/15/2024 3:46 AM
@Last Modified 10/15/2024 3:46 AM
Version 1.0
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\MyTools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //membuka driver
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize(); //untuk full screen
        System.out.println("Open browser");
        driver.get("https://demoqa.com/checkbox"); //link menuju web

        //locator
        //menggunakan css selector, klik kiri pada label lalu copy selector
        driver.findElement(By.cssSelector("#tree-node > ol > li > span > label")).click(); //checklist
        driver.findElement(By.cssSelector("#tree-node > ol > li > span > label")).click(); //unchecklist
        //hanya checklist document dan download
        driver.findElement(By.cssSelector("#tree-node > ol > li > span > button")).click();
        driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > label > span.rct-title")).click();
        driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-title")).click();

        try { //memberikan jeda
            Thread.sleep(2000); //2000 = 2 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); //close driver, all tab
        System.out.println("Quit browser");

    }
}
