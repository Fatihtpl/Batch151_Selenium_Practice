package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk = driver.findElement(By.xpath("//input[@id='number1']"));
        ilkKutucuk.sendKeys("20");

        // ikinci kutucuga 30 giriniz
        WebElement ikiinciKutucuk = driver.findElement(By.xpath("//*[@id='number2']"));
        ikiinciKutucuk.sendKeys("30");


        // calculate'e tıklayınız
        WebElement calculateButonu = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculateButonu.click();

        // sonucu yazdırınız
        System.out.println(" Sonuc: " + driver.findElement(By.xpath("//span[@id='answer']")).getText());    //getText methodu web element sonucunu stringe donusturur
                                                                                                                         // bir web elemente assianda edebilrsdik o sekilde yazdirabilirdik.


        // sayfayi kapatiniz
        driver.close();





    }
}
