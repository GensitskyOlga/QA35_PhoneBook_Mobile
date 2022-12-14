package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class AddNewContactScreen extends BaseScreen{
    public AddNewContactScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/action_bar']")
    AndroidElement contactList;
    @FindBy(xpath = "//*[@text= 'No Contacts. Add One more!']")
    AndroidElement NoContactsAddMoreText;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/add_contact_btn']")
    AndroidElement addButtonClick;
    @FindBy(xpath = "//*[@text= 'Add new contact']")
    AndroidElement addNewContactText;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/inputName']")
    AndroidElement editTextName;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/inputLastName']")
    AndroidElement editTextLastName;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/inputEmail']")
    AndroidElement editTextEmail;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/inputPhone']")
    AndroidElement editTextPhone;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/inputAddress']")
    AndroidElement editTextAddress;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/inputDesc']")
    AndroidElement editTextDescription;
    @FindBy(xpath = "//*[@resource-id= 'com.sheygam.contactapp:id/createBtn']")
    AndroidElement clickCreateButton;




}
