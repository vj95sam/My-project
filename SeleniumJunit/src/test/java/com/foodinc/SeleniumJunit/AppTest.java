package com.foodinc.SeleniumJunit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest{
	
	WebDriver driver;
	String url = "http://localhost:4200/login";
	String expectedTitle = "Food Inc Admin Dashboard";
	
	@DisplayName("Test FoodInc Admin Index Page")
	@Test
	public void testdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        System.out.println("TITLE:"+title);
        System.out.println("EXPECTEDTITLE"+expectedTitle);
        Assertions.assertEquals(expectedTitle, title);
        driver.quit();
	}
}
    