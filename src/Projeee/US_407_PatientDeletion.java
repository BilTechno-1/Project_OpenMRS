package Projeee;

/*
web adresi: https://demo.openmrs.org/openmrs/login.htm username:admin, password:Admin123
* login olmuş durumda olmalıdır.
* Doktor, "Hasta kaydı bul" [Find Patient Record] butonuna tıklar
* Doktor, arama kutucuğuna listede bulmak istediği hastanın adını veya ID'sini girer
* Doktor, arama sonucunda bulduğu hastanın üzerine tıklayabilmelidir.
* Doktor, hastanın üzerine tıkladığında, ilgili hastanın işlemlerini gerçekleştirebileceği bir sayfaya erişmelidir.
* Doktor, bu sayfada "General Actions" tabındaki [Delete Patient] linkini bulur ve tıklar.
* Doktor onay kutusuna [SİLME SEBEBİ) yazarak silme işlemine onay verir
* Doktor, hastayı başarıyla siler.
* Hastanın kayıtları sistemden kaldırılır.
*/


import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_407_PatientDeletion extends BaseDriverGenel {
    @Test
    public void PatientDeletion() {
        Elements_US_404_405 openMRS = new Elements_US_404_405();

        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        Tools.Bekle(2);

        wait.until(ExpectedConditions.visibilityOfAllElements(openMRS.username));
        openMRS.username.sendKeys("admin");

        wait.until(ExpectedConditions.visibilityOfAllElements(openMRS.passWord));
        openMRS.passWord.sendKeys("Admin123");

        openMRS.inpatientWard.click();

        wait.until(ExpectedConditions.elementToBeClickable(openMRS.loginBtn));
        openMRS.loginBtn.click();

        Assert.assertTrue(openMRS.textlabel.getText().contains("Logged in as Super User"), "başarılı bir şekilde login olunamadı");

        openMRS.findPatientRecord.click();
        openMRS.patientSearch.sendKeys("Mehmet");


        for (WebElement patient : openMRS.patientResults) {
            if (patient.getText().contains("Mehmet")) {
                patient.click();
                break;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(openMRS.deletePatient));
        openMRS.deletePatient.click();

        wait.until(ExpectedConditions.visibilityOf(openMRS.deleteReason));
        openMRS.deleteReason.sendKeys("Hatalı yazılan");

        openMRS.confirmBtn.click();
        System.out.println("son deneme. pul request olmuyor");


        //openMRS.verifyMessageContainsText("succsess");





    }
}
