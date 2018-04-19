Feature: All Common Features to get Data from Configuration Files
As a User i want to put all reusable Common Scenario

  Scenario Outline: I want to get property from Configuration File
    Given I want to get property <propertyType> from <fileType> Configuration File
  
    Examples: 
      | propertyType   | fileType | 
      | syncGatewayUrl | env      | 
      | SELECT_QUERY   | db       | 