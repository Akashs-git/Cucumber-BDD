package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagebase.Uploadscreen;
import testbase.Testbase1;


public class Uploadstepdef extends Testbase1 {
    Uploadscreen upscreen = new Uploadscreen();

    @Given("launch the URL")
    public void launch_the_url() {
        String URL = getPropertyValue("UploadURL");
        System.out.println(URL);
        upscreen.enterURL(URL);
        System.out.println("URL Launched successfully");


    }
    @Then("click the upload option")
    public void click_the_upload_option() {
        upscreen.clickupload();

    }
//    @Then("Upload the file")
//    public void upload_the_file() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Click upload option")
//    public void click_upload_option() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }




}
