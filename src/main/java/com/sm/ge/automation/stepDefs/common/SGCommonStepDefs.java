package com.sm.ge.automation.stepDefs.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sm.ge.automation.SyncGatewayTestHarness;

import cucumber.api.java.en.Given;

/**
 * @file SGCommonStepDefinitions.java
 * @package com.sm.automation.steps
 * @author Bharath Durga
 * @Date Apr 12, 2018
 * @Description All Common Step Definition
 */
public class SGCommonStepDefs extends SyncGatewayTestHarness {

	private static Log LOGGER = LogFactory.getLog(SGCommonStepDefs.class);

    @Given("^I want to validate (.+) sync for static Data Check$")
    public void i_want_to_validate_sync_for_static_data_check(String syncType)  {
    	LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
		LOGGER.info("Sync Type is  : " + syncType + "\n");
    	LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
    }

 
    @Given("^I want to initiate (.+) sync$")
    public void i_want_to_initiate_sync(String syncType)  {
    	LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
		LOGGER.info("Sync Type is  : " + syncType + "\n");
    	LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());

    }
}
