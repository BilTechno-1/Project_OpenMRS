package Projeee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_409 extends BaseDriverGenel {

    @Test
    public void hastaKayıtlarınıBirleştirmeMerge() {
        Elements elements = new Elements();
        Tools.login();
        Tools.hastaBilgileri();
        String id1 = elements.hastaId.getText();
        System.out.println("id1 = " + id1);
        elements.logo.click();
        Tools.hastaBilgileri();
        String id2 = elements.hastaId.getText();
        System.out.println("id2 = " + id2);
        elements.logo.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.dataManagement)).click();
        elements.mergePatientElectronicRecords.click();
        elements.patientID1.sendKeys(id1);
        elements.patientID2.sendKeys(id2);
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirmbutton)).click();

        elements.hastaSecme.click();
        elements.confirmbutton.click();


    }
}
