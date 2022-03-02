package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {
    public static void main(String[] args) {
       // WebDriver driver = new ChromeDriver();

      FirefoxOptions options = new FirefoxOptions();
       options.setBinary("/snap/bin/firefox");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();

        searchBox.sendKeys("Selenium Testing");
        searchBox.sendKeys(Keys.ENTER);

    }
}
