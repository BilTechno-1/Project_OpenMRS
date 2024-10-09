package Projeee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_404 extends BaseDriverGenel {

    @Test()
    public void HastaKayıt() {
        Elements elements = new Elements();

        Tools.login();

        elements.registeraPatient.click();

        //Demographics
        elements.givenName.sendKeys("Polat");
        elements.familyName.sendKeys("Yuce");
        elements.nextButton.click();
        Select gender=new Select(elements.gender);
        gender.selectByVisibleText("Male");
        elements.nextButton.click();
        elements.day.sendKeys("23");
        Select month=new Select(elements.month);
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
        Select relationship_type=new Select(elements.relationship_type);
        relationship_type.selectByIndex(3);
        elements.personName.sendKeys("cumalettin");
        elements.nextButton.click();

        elements.confirm.click();

        Assert.assertTrue(elements.hastaKayıtAdıKontrolü.getText().equals("Polat"),"Hasta isimleri uyuşmuyor");
        System.out.println("Hasta ID si = " + elements.hastaId.getText());
        Assert.assertTrue(elements.hastaId.isDisplayed(),"Hasta ID si gözükmüyor");




    }
}
