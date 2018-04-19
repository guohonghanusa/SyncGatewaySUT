package com.sm.ge.automation.stepDefs.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sm.ge.automation.SyncGatewayTestHarness;

import cucumber.api.java.en.Given;

/**
 * @file CommonSFDCStepDefinitions.java
 * @package com.sm.automation.steps
 * @author Bharath Durga
 * @Date Apr 12, 2018
 * @Description All Common Step Definition
 */
public class CommonSFDCStepDefs extends SyncGatewayTestHarness {

	private static Log LOGGER = LogFactory.getLog(CommonSFDCStepDefs.class);
	
   
    @Given("^I want to (.+) transaction record for (.+) Object in SFDC$")
    public void i_want_to_transaction_record_for_object_in_sfdc(String transactionType, String transactionTable)  {
    	LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
		LOGGER.info("transaction Type is  : " + transactionType + "\n");
		LOGGER.info("transaction Table is  : " + transactionTable+ "\n");
		LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
		// throw new PendingException();
    }

    @Given("^I want to validate transaction record that was created$")
    public void i_want_to_validate_transaction_record_that_was_created()   {
    	LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
    	LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
		//throw new PendingException();
    }
}
