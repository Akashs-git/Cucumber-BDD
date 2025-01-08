package pagebase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.Initializationstepdef;
import testbase.Pagebase;

public class Uploadscreen extends Pagebase {
    public static String toolName = Initializationstepdef.toolName;

    public Uploadscreen() {
        super(toolName);
    }

    @FindBy(xpath = "//input[@id='fileInput']")
    private WebElement uploadOption;



    public void enterURL(String url) {
        try {
            enterURL(url, "URL_Launched");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }

    public void clickupload(){
        try {
        elementClick(uploadOption,"Upload option click");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }




}
