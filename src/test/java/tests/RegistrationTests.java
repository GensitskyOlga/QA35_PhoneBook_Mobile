package tests;

import config.AppiumConfig;
import models.Auth;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.ContactListScreen;
import screens.SplashScreen;

import java.time.Duration;

public class RegistrationTests extends AppiumConfig {
    @Test
    public void registrationSuccess() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        boolean res = new SplashScreen(driver)
                .checkVersion("1.0.0")
                .fillEmail("gen" + i + "@bk.ru")
                .fillPassword("Od123456$")
                .submitRegistration();
        Assert.assertTrue(res);
        new ContactListScreen(driver)
                .logout();
        ;
    }

    @Test
    public void registrationSuccessModel() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        boolean res = new AuthenticationScreen(driver)
                .registration(Auth.builder().email("gen" + i + "@bk.ru").password("Od123456$").build())
                .isContactListActivityPresent();
        Assert.assertTrue(res);
        new ContactListScreen(driver)
                .logout();
    }

   // @Test
   // public void registrationWrongEmail() {
     //   boolean res = new SplashScreen(driver)
        //        .checkVersion("1.0.0")
         //       .fillEmail("frebk.ru")
         //       .fillPassword("Od123456$")
          //      .submitRegistration();


    }




