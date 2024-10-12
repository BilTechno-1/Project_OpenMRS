package Utility;

import Projeee.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static Utility.BaseDriverGenel.driver;
import static Utility.BaseDriverGenel.wait;

public class Tools {

    public static void Wait(int sn) {

        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public static int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }


    public static void login(){
        Elements elements = new Elements();

        driver.get("https://openmrs.org//");
        Tools.Bekle(2);

        wait.until(ExpectedConditions.elementToBeClickable(elements.dilAyari)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.english)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.demo)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.exploreOpenMRS2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.entertheOpenMRS2Demo)).click();


        elements.username.sendKeys("admin");
        elements.password.sendKeys("Admin123");

        // random location tıklama
        int randomSecim = Tools.randomGenerator(elements.randomLocation.size());
        String tiklatilacakLocationAdi = elements.randomLocation.get(randomSecim).getText();
        System.out.println("tiklatilacakLocationAdi = " + tiklatilacakLocationAdi);
        elements.randomLocation.get(randomSecim).click();

        elements.loginButton.click();
    }

    public static void hastaBilgileri(){
        Elements elements = new Elements();

        elements.registeraPatient.click();

        //Demographics
        elements.givenName.sendKeys("Polat");
        elements.familyName.sendKeys("Yuce");
        elements.nextButton.click();
        Select gender = new Select(elements.gender);
        gender.selectByVisibleText("Male");
        elements.nextButton.click();
        elements.day.sendKeys("23");
        Select month = new Select(elements.month);
        month.selectByVisibleText("January");
        elements.year.sendKeys("2000");
        elements.nextButton.click();

        //Contact Info
        elements.adress.sendKeys("fasdfsad");
        elements.adress2.sendKeys("fasfaddfsad");
        elements.cityVillage.sendKeys("fdsgfa");
        elements.stateProvince.sendKeys("fdsghgfhdffa");
        elements.country.sendKeys("Türkiye");
        elements.postalCode.sendKeys("16001");
        elements.nextButton.click();
        elements.phoneNumber.sendKeys("52354235");
        elements.nextButton.click();

        //Relationships
        Select relationship_type = new Select(elements.relationship_type);
        relationship_type.selectByIndex(3);
        elements.personName.sendKeys("cumalettin");
        elements.nextButton.click();

        elements.confirm.click();

    }
    public static boolean listContainsString(List<WebElement> list, String aranacakKelime ){
        boolean urunBulundu=false;
        for(WebElement urun : list)
        {
            if (urun.getText().equals(aranacakKelime)) {
                urunBulundu = true;
                break;
            }
        }
        return  urunBulundu;
    }

}
