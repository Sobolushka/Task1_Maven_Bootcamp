package ru.stqa.train;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
public class MyTestBrowser {
    private WebDriver driver;
    private WebDriverWait wait;
    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,100);
    }
    @Test
    public void myFirstTest(){
        driver.get("http://www.google.com/");
    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
