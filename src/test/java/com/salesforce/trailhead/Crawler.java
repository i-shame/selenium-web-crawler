package com.salesforce.trailhead;

import crawler.BaseCrawler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Crawler extends BaseCrawler {

    private final String FORCE_COM_ADMIN_BEGINNER = "https://trailhead.salesforce.com/en/trails/force_com_admin_beginner";

    @BeforeMethod(description = "案件一覧の準備")
    public void init() {
//        driver.get(FORCE_COM_ADMIN_BEGINNER);
    }

    @Test(description = "初期表示")
    public void execute() {

        LOGGER.trace("Trace Message!");
        LOGGER.debug("Debug Message!");
        LOGGER.info("Info Message!");
        LOGGER.warn("Warn Message!");
        LOGGER.error("Error Message!");
        LOGGER.fatal("Fatal Message!");

//        Assert.assertEquals(driver.getTitle(), "Admin Beginner | Salesforce Trailhead");
    }
}
