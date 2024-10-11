package UserStory_06_;


import UserStory_06_.Utility.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OnThePatientListSearching_POM extends BaseDriver {
    @Test
    public void ProceedToCheckout() {

            OnThePatientListSearching_Elementleri elements = new OnThePatientListSearching_Elementleri();

            // Dil seçimini yapma
            String languageToSelect = "English";
            logger.info("Dil seçimi yapılıyor: {}", languageToSelect);
            elements.selectLanguage(languageToSelect);

            // URL değişimini bekleme
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            logger.info("URL değişimi bekleniyor...");
            wait.until(ExpectedConditions.urlContains("https://openmrs.org/"));

            // Demo öğesinin görünürlüğünü kontrol etme
            logger.info("Demo öğesi kontrol ediliyor...");
            wait.until(ExpectedConditions.elementToBeClickable(elements.demo));
            elements.demo.click();
            logger.info("Demo öğesine tıklandı.");

            elements.EO2.click(); // "Explore OpenMRS 2" öğesine tıklama
            logger.info("Explore OpenMRS 2 öğesine tıklandı.");

            // Yeni buton için bekleme
            logger.info("Yeni buton görünürlüğü bekleniyor...");
            wait.until(ExpectedConditions.visibilityOf(elements.EO2D));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", elements.EO2D);
            logger.info("Yeni butona tıklandı.");

            wait.until(ExpectedConditions.urlContains("https://demo.openmrs.org/openmrs/login.htm"));

            // Giriş bilgilerini girme
            logger.info("Giriş bilgileri giriliyor...");
            elements.username.sendKeys("Admin");
            elements.password.sendKeys("Admin123");
            elements.locationSelection.click();
            elements.login.click();
            logger.info("Giriş yapılıyor...");

            // Geçerli bir hasta araması yapma
            logger.info("Geçerli hasta araması yapılıyor...");
            wait.until(ExpectedConditions.elementToBeClickable(elements.FindPatientRecord)).click();
            elements.searchInput.sendKeys("100J19" + Keys.ENTER);

            // Arama sonucuna tıklama
            Assert.assertTrue(elements.result.isDisplayed(), "Hasta sonucu görünmüyor!");
            logger.info("Hasta sonucu görünür durumda, tıklanıyor...");
            elements.result.click();

            // Arama kısmına geri dön
            logger.info("Arama kısmına geri dönülüyor...");
            driver.navigate().back();
            driver.navigate().to("https://demo.openmrs.org/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient");

            // URL'nin güncellenmesini bekle
            logger.info("URL güncellenmesi bekleniyor...");
            wait.until(ExpectedConditions.visibilityOf(elements.searchInput));
            elements.searchInput.clear();
            elements.searchInput.sendKeys("1111" + Keys.ENTER); // Mevcut olmayan bir hasta ID'
            // Hata mesajının görünmesini bekleyin
            logger.info("Hata mesajının görünmesi bekleniyor...");
            wait.until(ExpectedConditions.visibilityOf(elements.message));

            // Hata mesajını doğrula
            Assert.assertTrue(elements.message.isDisplayed(), "Hata mesajı görüntülenmedi.");
            logger.error("Hata mesajı görüntülendi!");

            // Hata mesajını konsola yazdır
            String errorMessage = elements.message.getText();
            logger.warn("Hata Mesajı: {}", errorMessage);
}}
