package Akakce;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AkakceTest extends MainClass{

    @Test
    public void Test() throws InterruptedException {

        //Kullanıcı akakce.com sitesine giriş yapar.
        driver.get("https://www.akakce.com/");

        //Kullanıcı arama işlemi yapar (Örnek: “iphone” gibi popüler ve yorumu olan bir ürün)
        driver.findElement(By.id("q")).sendKeys("iphone");

        //Kullanıcı "Ara" butonuna tıklar.
        driver.findElement(By.cssSelector("button[title='Ara']")).click();

        //Kullanıcı arama sonucunda gelen ürün listesinden ürün seçer ve ürüne git seçeneğine tıklar.
        driver.findElement(By.cssSelector("a[title='iPhone 13 128 GB'] span[class='bt_v8'] b")).click();

        //Sayfa aşağı kaydırıldı.
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (int i = 0; i < 2; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }

        //Kullanıcı ürünü takip listesine ekler.
        driver.findElement(By.cssSelector("div[id='pf_w_v8'] span[class='ufo_v8']")).click();

        Thread.sleep(2000);

        //Ürünler giriş yapılmadan takip listesine eklenemediği için giriş yapılacaktır.

        //Kullanıcı email ve password girer.
        WebElement email = driver.findElement(By.id("life"));
        email.sendKeys("test_tester@gmail.com");
        WebElement psw = driver.findElement(By.id("lifp"));
        psw.sendKeys("Testtest10");

        //Kullanıcı "Giriş Yap" butonuna tıklar.
        driver.findElement(By.id("lfb")).click();
    }
}