package com.kitapyurdu.driver.page;

import com.kitapyurdu.driver.method.method;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HomePage {
    method methods;
    Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage() {
        methods = new method();
    }

    public void search() throws IOException, CsvValidationException {

        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\furka\\IdeaProjects\\qa_testt\\src\\test\\roman.csv"));


        String[] csvCell;
        String Searching = null;
        while ((csvCell = csvReader.readNext()) != null) {

               Searching = csvCell[0];
        }

        //Arama Kısımına Roman Yazılması
        methods.sendKeys(By.cssSelector("input[name='search_keyword']"), Searching);
        //Enter Tuşu Basılması
        methods.findElement(By.cssSelector("input[name='search_keyword']")).sendKeys(Keys.ENTER);
        methods.waitBySeconds(1);
    }
}

