Feature: Initiate Initial Sync and validate 
	As a User I want to Initiate Initial Sync and validate

Scenario Outline: I want to validate Initial Sync 
	Given I want to <createTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <createTransaction> transaction record for <eventTable> Object in SFDC 
	And I want to initiate <SyncType> sync 
	Then I want to validate <initialSyncType> sync for static Data Check 
	And I want to validate transaction record that was created 
	Then I want to <cdeleteTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <deleteTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <deleteTransaction> transaction record for <workOrderTable> Object in SFDC 
	
	Examples: 
		| workOrderTable  | eventTable  | createTransaction | deleteTransaction | initialSyncType | incrmentalSyncType|
		| workOrderObject | eventObject | create            | delete            | initial  | incremental|
		
		
