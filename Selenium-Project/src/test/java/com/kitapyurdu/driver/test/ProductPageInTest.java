package com.kitapyurdu.driver.test;

import com.kitapyurdu.driver.driver.BaseTest;
import com.kitapyurdu.driver.page.HomePage;
import com.kitapyurdu.driver.page.ProductPage;
import com.kitapyurdu.driver.page.ProductPageIn;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import java.io.IOException;


    public class ProductPageInTest extends BaseTest {
        @Test
        public void productpageTestIn() throws CsvValidationException, IOException, InterruptedException {
            HomePage homePage = new HomePage();
            ProductPage productPage=new ProductPage();
            ProductPageIn productpagein=new ProductPageIn();

            homePage.search();
            productPage.selectRandom();
            productpagein.ProductAddAndCheck();




        }
    }

