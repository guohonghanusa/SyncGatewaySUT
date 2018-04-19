Feature: All Common SFDC Features 
As a User i want to put all reusable Common SFDC Scenario
 
  Scenario Outline: I want to create Transaction record in SFDC
    Given I want to <TransactionType> transaction record for <transactionTable> Object in SFDC
  
    Examples: 
      | TransactionType | transactionTable | 
      | create          | workOrderObject  | 
      | delete          | workOrderObject  | 
  
      
  Scenario: I want to validate transaction records 
    Given I want to validate transaction record that was created