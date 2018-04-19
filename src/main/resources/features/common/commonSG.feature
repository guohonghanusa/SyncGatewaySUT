Feature: All Common Scenario's for Sync Gate way
As a User i want to put all reusable Common Sync Gateway Scenario

  Scenario Outline: I want to validate Sync for all Static Data Check
    Given I want to validate <SyncType> sync for static Data Check
  
    Examples: 
      | SyncType      | 
      | initial       | 
      | incremental   | 
      | configuration | 
      | dataPurga     | 
  
  Scenario Outline: I want to initiate Sync
    Given I want to initiate <SyncType> sync
  
    Examples: 
      | SyncType      | 
      | initial       | 
      | incremental   | 
      | configuration | 
      | dataPurga     | 

  

  
