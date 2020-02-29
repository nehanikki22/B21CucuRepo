Feature: Testing Rest Assured Get Basic

Scenario: 1.I want to test get request
Given race circuite application is running
When I hit get request to get response
Then I validate circuite "MRData.limit" value as "30" present
Then I validate circuite "MRData.total" value as "20" present
Then I validate circuite "MRData.CircuitTable.Circuits[0].circuitId" value as "30" present
#Then I validate circuite name
Then I want total Value
