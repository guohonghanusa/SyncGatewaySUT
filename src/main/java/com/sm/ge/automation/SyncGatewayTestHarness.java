package com.sm.ge.automation;

import com.servicemax.automation.core.SMMSTRestUtil;

/**
 * @file SyncGatewayTestHarness.java
 * @package com.sm.automation
 * @author Bharath Durga
 * @Date Apr 12, 2018
 * @Description SyncGateway Base Class that Call BEAT Framework
 */
public class SyncGatewayTestHarness extends SMMSTRestUtil {

	/**
	 * 
	 * @methodName getSalesforceToken
	 * @returns String
	 * @return
	 */

	public String getSalesforceToken() {
		return getOuthToken("token_url", "grant_type", "username", "password", "client_id", "client_secret");
	}
}
