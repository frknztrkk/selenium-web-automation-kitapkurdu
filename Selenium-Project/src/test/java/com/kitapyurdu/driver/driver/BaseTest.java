package com.kitapyurdu.driver.driver;

import com.opencsv.CSVReader;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;
    String CSV_PATH= "C:\\Users\\furka\\IdeaProjects\\Selenium-Project\\roman.csv";
    public CSVReader csvReader;
    String[] csvCell;
    @Before
    //Web Sayfası Açılması
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.kitapyurdu.com");
        driver.manage().window().maximize();


    }
    //Web Sayfası Kapanması
    @After
    public void tearDown(){

        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
}


