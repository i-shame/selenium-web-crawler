package scenario.net;

import model.net.Html5up;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scenario.BaseScenario;
import utils.Const;

public class Html5upScenario extends BaseScenario {
    public Html5up baseModel;

    @BeforeMethod(description = "")
    private void init() {
        driver.get(Const.HTML5UP_NET);
        baseModel = PageFactory.initElements(driver, Html5up.class);
    }

    @Test(description = "")
    public void execute() {
        for (WebElement element : baseModel.placeholderImageList) {
            System.out.println(element.getAttribute("src"));
        }
    }
}
