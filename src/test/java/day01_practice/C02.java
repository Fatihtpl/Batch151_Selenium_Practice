package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

         // arama motorunda nutella yazip aratınız
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella"+ Keys.ENTER);

         // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin

        for (int i = 0; i <2 ; i++) {

            List<WebElement> butonlar =driver.findElements(By.xpath("(//*[@class='nav-a  '])[2] | (//*[@class='nav-a  '])[3]"));//iksinide ayni anda aldik locatelerin.ayrida alabilirdik.
            butonlar.get(i).click();


            if (driver.getTitle().contains("Amazon")){
                System.out.println("Title Amazon içeriyor.");
            }else System.out.println("Title Amazon içermiyor");

            Thread.sleep(3000);

            driver.navigate().back();


        }

         // pencereyi kapatiniz
        driver.close();

    }
}
