Feature:Testing basics

Scenario: 1 I want to test google is up and runining
Given google have website
When I hit google application
Then I validate status code

Scenario:2 I want to test the actual data of F1 cars
When I hit the application
Then I validate the status code