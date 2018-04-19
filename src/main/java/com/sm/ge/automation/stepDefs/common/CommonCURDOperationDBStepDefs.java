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

	@Given("^I want to update LST in clientCache table of (.+) Database$")
	public void i_want_to_update_lst_in_clientcache_table_of_database(String incrementalDBName) {
		LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
		LOGGER.info("Incremental DB Name   : " + incrementalDBName + "\n");
		LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
	}

}
