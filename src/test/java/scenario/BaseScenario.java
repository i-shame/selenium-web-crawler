package scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utils.BrowserFactory;
import utils.Const;

public class BaseScenario {

    public WebDriver driver;
    public WebDriverWait waiter;

    @Parameters(Const.TYPE_BROWSER)
    @BeforeClass
    public void beforeExecution(@Optional String browser) {
        driver = BrowserFactory.getInstance(browser).init();
        waiter = new WebDriverWait(driver, Const.TIMEOUT_IN_SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
