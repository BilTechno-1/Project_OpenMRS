package Projeee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_408 extends BaseDriverGenel {
    @Test
    public void HastaListeleme() {


            Elements elements = new Elements();
            Tools.login();

            elements.hastaKayıtArama.click();
            System.out.println("elements.identifier.size() = " + elements.identifier.size());
            System.out.println("identifier.size entries var mı= " + elements.hastaSayısı.getText().contains(elements.identifier.size() + " entries"));

            Assert.assertTrue(elements.hastaSayısı.getText().contains(elements.identifier.size()+" entries")
                    ,"Hasta sayısı ile id sayısı aynı değil");


        }






    }


