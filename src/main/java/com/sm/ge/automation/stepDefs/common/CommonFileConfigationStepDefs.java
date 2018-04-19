package com.sm.ge.automation.stepDefs.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sm.ge.automation.SyncGatewayTestHarness;

import cucumber.api.java.en.Given;

/**
 * @file SyncGatewayCommonSteps.java
 * @package com.sm.automation.steps
 * @author Bharath Durga
 * @Date Apr 12, 2018
 * @Description All Common Step Definition
 */
public class CommonFileConfigationStepDefs extends SyncGatewayTestHarness {

	private static Log LOGGER = LogFactory.getLog(CommonFileConfigationStepDefs.class);

	@Given("^I want to get property (.+) from (.+) Configuration File$")
	public void i_want_to_get_property_from_configuration_file(String propertyType, String fileType) {
		LOGGER.info("Start of " + new Object() {}.getClass().getEnclosingMethod().getName());
		LOGGER.info("Property Type is  : " + propertyType + "\n");
		LOGGER.info("File Type is  : " + fileType + "\n");
		LOGGER.info("End of " + new Object() {}.getClass().getEnclosingMethod().getName());
	}
}
