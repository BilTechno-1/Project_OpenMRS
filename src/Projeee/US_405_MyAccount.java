package Projeee;
/*
* Kullanıcı Login olma sayfasındadır
* Kullanıcı random olarak Location butonuna tıklar
* Kullanıcı başarılı bir şekilde Login olur (US_402 'ye bağımlı)
* Kullanıcı profil icon unun üzerine hover-over yaptığında [My Accounts] linki görülebilir ve tıklanabilir durumdadır.
* Kullanıcı [My Accounts] linkine tıkladığında, "Cahange Password" ve "My Languages" butonlarını görebilmeli ve tıklayabilmelidir..
*/


import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_405_MyAccount extends BaseDriverGenel {
@Test
public void MyAccount(){

    driver.get("https://openmrs.org/");
    Tools.Bekle(2);

    Elements_Ummet openMRS=new Elements_Ummet();

    wait.until(ExpectedConditions.elementToBeClickable(openMRS.languageBtn));
    openMRS.languageBtn.click();

    wait.until(ExpectedConditions.elementToBeClickable(openMRS.englishLanguage));
    openMRS.englishLanguage.click();

    //Assert.assertTrue(driver.getCurrentUrl().equals("https://openmrs.org/"));

    wait.until(ExpectedConditions.elementToBeClickable(openMRS.demoBtn));
    openMRS.demoBtn.click();

    wait.until(ExpectedConditions.elementToBeClickable(openMRS.openMrs2));
    openMRS.openMrs2.click();

    wait.until(ExpectedConditions.elementToBeClickable(openMRS.openMrs2Demo));
    System.out.println("Mrs2Demo butonu aktif mi? = " + openMRS.openMrs2Demo.isEnabled());
    new Actions(driver).moveToElement(openMRS.openMrs2Demo).click().build().perform();

    wait.until(ExpectedConditions.titleIs("Login"));
    openMRS.username.sendKeys("admin");

    openMRS.passWord.sendKeys("password");

    int randomSecim=Tools.randomGenerator(openMRS.sessionLocationList.size());
    System.out.println(randomSecim);

    String tiklatilacakLocationName=openMRS.sessionLocationList.get(randomSecim).getText();
    openMRS.sessionLocationList.get(randomSecim).click();

    boolean urunBulundu= Tools.listContainsString(openMRS.sessionLocationList, tiklatilacakLocationName);
    Assert.assertTrue(urunBulundu, "Seçtiğiniz Location bulunamadı");

    openMRS.loginBtn.click();

    Assert.assertTrue(openMRS.textlabel.getText().contains("Logged in as Super User"));

    new Actions(driver).moveToElement(openMRS.admin).build().perform();

    Assert.assertTrue(openMRS.myAccount.isDisplayed(),"My Account butonu görülebilri değil");
    wait.until(ExpectedConditions.elementToBeClickable(openMRS.myAccount));

    openMRS.myAccount.click();
    Assert.assertTrue(openMRS.changePassword.isDisplayed() && openMRS.changePassword.isEnabled(),"Change Password butonu aktif değil");
    Assert.assertTrue(openMRS.myLanguages.isDisplayed(),"My languages butonu aktif değildir");

}


}
