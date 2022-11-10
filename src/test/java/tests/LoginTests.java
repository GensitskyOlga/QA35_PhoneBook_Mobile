package tests;

import config.AppiumConfig;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.ContactListScreen;
import screens.SplashScreen;

public class LoginTests extends AppiumConfig {
    @Test
    public void loginSuccess(){
      boolean res = new SplashScreen(driver)

                .checkVersion("1.0.0")
                .fillEmail("gensitskaya@bk.ru")
                .fillPassword("Od123456$")
                .submitLogin()
                .isContactListActivityPresent();
        Assert.assertTrue(res);

    new ContactListScreen(driver)
    .logout();
    }
    @Test
    public void loginSuccessModel(){
       //boolean res= new SplashScreen(driver)
            //    .checkVersion("1.0.0")
        boolean res=new AuthenticationScreen(driver)
                .login(Auth.builder().email("gensitskaya@bk.ru").password("Od123456$").build())
                .isContactListActivityPresent();
        Assert.assertTrue(res);
        new ContactListScreen(driver)
                .logout();
    }
}
