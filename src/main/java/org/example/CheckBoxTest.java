package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Main.chromeDriver;
import static org.junit.Assert.assertTrue;

public class CheckBoxTest {
    private WebDriver driver;

    @BeforeClass
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup(){
        driver = chromeDriver();
        driver.get("http://localhost:8082/");
        WebElement checkboxLink =driver.findElement(By.id("checkboxLink"));
        checkboxLink.click();
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
    @Test
    public void test_checkbox_selected(){
    WebElement lettuce =driver.findElement(By.id("lettuceCheckbox"));
   lettuce.click();
    assertTrue(lettuce.isSelected());
}

}
