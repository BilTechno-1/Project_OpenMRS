package Projeee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class US_403 extends BaseDriverGenel {

    @Test(groups = {"Smoke Test"} )
    public void SistemdenÇıkışLogoutYapmak() {

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
        elements.ınpatientWard.click();
        elements.loginButton.click();
        elements.logout.click();


    }
}
