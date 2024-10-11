package UserStory_06_.Utility;
import Utility.Tools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static Logger logger = LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void InitialTransactions(){
        logger.info("Loglama işlemi başladı");
       // System.out.println("Başlangıç işlemleri yapılıyor");

        driver=new ChromeDriver();
        driver.get("https://openmrs.org/demo/");

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @AfterClass
    public void ClosingTransactions(){
       // System.out.println("Kapanis işlemleri yapılıyor");

        Tools.Wait(3);
        driver.quit();
        logger.info("Loglama işlemi bitti");
    }


}
