Feature: All Common Features related to DB CRUD Operations
As a User i want to put all reusable DB CRUD Operation Scenario

  Scenario Outline: I want to update LST in Incremental DB
    Given I want to update LST in clientCache table of <incrementalDBName > Database 
  
    Examples: 
      | incrementalDBName   |
      | dbName |
