 # Author: michael.bedoya.cano@accenture.com

  @BancolombiacreditSimulation
  Feature: Bancolombia car credit simulation
    As a Bancolombia´s client
    I want to simulate a car´s credit
    To know if I have capacity to buy a car

  Background: Enter to the form page
    Given that I am in the form page

  @FirstScenario
  Scenario: Try to sent a form without information
    When I click the button to sent the information
    Then I hope to see the button disable

  @SecondScenario
  Scenario: Form not fill
    When I see the fields below
    Then I hope to see the error message "Este campo es obligatorio." for every field


  Scenario Template: Fill the form with Wrong information
    When I try to fill the field Para que quieres ahorrar "Este campo es obligatorio." with wrong information
    Then I hope to see the error message <errorMessage> for this field

    Examples:
							| ParaQueQuieresAhorrar|
							|         "Hi"         |
							|         "Every"      |
						  |         "One"        |