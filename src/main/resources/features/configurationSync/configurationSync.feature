Feature: Initiate Configuration Sync and validate 
	As a User I want to Initiate Configuration Sync and validate

Scenario Outline: I want to validate Configuration Sync 
	
	Given I want to initiate <SyncType> sync 
	Then I want to validate <SyncType> sync for static Data Check 

	Examples: 
		| syncType | 
		| configurationSync  | 
		
		
