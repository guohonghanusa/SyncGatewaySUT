package com.sm.ge.automation.stepDefs.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cucumber.api.java.en.Given;

/**
 * @file CommonCURDOperationDBStepDefs.java
 * @package com.sm.ge.automation.stepDefs.common
 * @author Bharath Durga
 * @Date Apr 18, 2018
 * @Description TODO
 */
public class CommonCURDOperationDBStepDefs {
	private static Log LOGGER = LogFactory.getLog(CommonCURDOperationDBStepDefs.class);

	@Given("^I want to create Incremental DB with updated LST$")
	public void i_want_to_create_incremental_db_with_updated_lst() {
		LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
		LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
	}

}
