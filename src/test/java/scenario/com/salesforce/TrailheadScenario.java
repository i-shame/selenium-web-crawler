package scenario.com.salesforce;

import model.com.salesforce.Trailhead;
import org.openqa.selenium.support.PageFactory;
import scenario.BaseScenario;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrailheadScenario extends BaseScenario {

    private final String FORCE_COM_ADMIN_BEGINNER = "https://trailhead.salesforce.com/en/trails/force_com_admin_beginner";

    @BeforeMethod(description = "Init Scenario")
    public void init() {
    }

    @Test
    public void execute() {
    }
}
