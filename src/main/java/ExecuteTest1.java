import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features ="src/main/java/Feature/UploadTest.feature" ,
        glue = {"steps.Uploadstepdef"},
        dryRun = false,
        monochrome = true,stepNotifications = true,
        plugin = {"html:target/cucumber-report/reports1.html"})

public class ExecuteTest1 {
}
