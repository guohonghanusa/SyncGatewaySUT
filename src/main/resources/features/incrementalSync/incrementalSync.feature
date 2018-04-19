Feature: Initiate Incremental Sync and validate 
	As a User I want to Initiate Incremental Sync and validate

Scenario Outline: I want to validate Initial Sync 
	Given I want to <createTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <createTransaction> transaction record for <eventTable> Object in SFDC 
	Then I want to create Incremental DB with updated LST 
	Given I want to <updateTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to initiate <incrmentalSyncType> sync 
	Then I want to validate <incrmentalSyncType> sync for static Data Check 
	And I want to validate transaction record that was created 
	Then I want to <deleteTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <deleteTransaction> transaction record for <eventTable> Object in SFDC 
	
	Examples: 
		| workOrderTable  | eventTable  | createTransaction | deleteTransaction | updateTransaction | incrmentalSyncType | 
		| workOrderObject | eventObject | create            | delete            | update            | incremental        | 