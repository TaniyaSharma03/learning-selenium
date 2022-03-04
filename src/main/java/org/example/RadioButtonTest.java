package org.example;

import com.sun.jna.Structure;
import io.github.bonigarcia.wdm.WdmAgent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.Main.chromeDriver;
import static org.junit.Assert.assertTrue;

public class RadioButtonTest {
    private WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {
        driver = chromeDriver();
        driver.get("http://localhost:8082/");
        WebElement radioLink = driver.findElement(By.id("radioLink"));
        radioLink.click();

    }

    @Test
    public void test_radio_selected() {
List<WebElement> color= driver.findElements(By.name("color"));
for (WebElement element:color){
    if (element.getAttribute("value").equals("blue")){
        element.click();
    }
}
//    color.get(2).click();
//    assertEquals("blue", color.get(2).getAttribute("value"));
assertTrue(color.get(2).isSelected());
    }
}