Feature: Initiate Data Purge Sync and validate 
	As a User I want to Initiate Incremental Sync and validate

Scenario Outline: I want to validate Initial Sync 
	Given I want to <createTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <createTransaction> transaction record for <eventTable> Object in SFDC 
	And I want to initiate <syncType> sync 
	And I want to validate transaction record that was created 
	Then I want to <deleteTransaction> transaction record for <workOrderTable> Object in SFDC 
	And I want to <deleteTransaction> transaction record for <eventTable> Object in SFDC 
	
	Examples: 
		| workOrderTable  | eventTable  | createTransaction | deleteTransaction | syncType |
		| workOrderObject | eventObject | create            | delete            | Purge         | 