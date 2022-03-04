package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Main.chromeDriver;
import static org.junit.Assert.assertEquals;

public class SeleniumWebsiteTest {
@Test
    public void test_selenium_dot_dev_blog(){
        WebDriver driver = chromeDriver();
        driver.get("https://www.selenium.dev/");

        WebElement blog =driver.findElement(By.linkText("Blog"));
        blog.click();
        WebElement link2016 = driver.findElement(By.id("m-blog2016-li"));
        link2016.click();
        WebElement element= driver.findElement(By.linkText("Fall Selenium Conf, Save the Date & Call for Speakers!"));
        assertEquals("Fall Selenium Conf, Save the Date & Call for Speakers!",element.getText());

        String title = driver.getTitle();
        assertEquals("Blog Posts - 2016 | Selenium", title);

        driver.quit();
    }

}
