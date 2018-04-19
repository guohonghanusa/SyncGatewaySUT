package com.sm.ge.automation.stepDefs.salesforce;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sm.ge.automation.SyncGatewayTestHarness;

import cucumber.api.java.en.Given;

/**
 * @file SalesforceTokenSteps.java
 * @package com.sm.automation.steps.salesforceToken
 * @author Bharath Durga
 * @Date Apr 12, 2018
 * @Description Step Definition File for Sales force Token Generator Feature
 */
public class SalesforceTokenStepDefs extends SyncGatewayTestHarness {

	private static Log LOGGER = LogFactory.getLog(SalesforceTokenStepDefs.class);
	   
    @Given("^I want validate a salesforce user credentials by generating a Token$")
    public void i_want_validate_a_salesforce_user_credentials_by_generating_a_token() throws Throwable {
    	LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
		String token = getSalesforceToken();
		assertThat(token, notNullValue());
		LOGGER.info("Salesforce Token is  \n " + token);
		LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
    }
}
