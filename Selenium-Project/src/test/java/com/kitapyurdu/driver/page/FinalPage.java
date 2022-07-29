package com.kitapyurdu.driver.page;

import com.kitapyurdu.driver.method.method;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class FinalPage {
    method methods;
    Logger logger = LogManager.getLogger(FinalPage.class);

    public FinalPage() {
        methods = new method();
    }

    public void Basket() throws InterruptedException {
        //ürünün miktar arttırılması
        methods.clearText(By.name("quantity"));
        methods.sendKeys(By.name("quantity"),"2");
        //Yenile Butonuna Basılması
        methods.clickElement(By.cssSelector("i.fa.fa-refresh.green-icon"));
        methods.waitBySeconds(2);
        //Güncelleme Yazısı Kontrolü
        methods.productUpdateCheck(By.id("swal2-title"));
        methods.clickElement(By.cssSelector(".fa.fa-times.red-icon"));
        Thread.sleep(500);
        //sepet Boş Kontrolü
        methods.emptyProductCheck("Sepetiniz boş",By.id("cart-items-empty"),"Sepet Dolu");




    }
}
