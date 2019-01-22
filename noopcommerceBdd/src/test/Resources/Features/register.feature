Feature:registeration
  @registration
  Scenario:registration sucessfully with valid credentials

    Given Url "https://demo.nopcommerce.com"
    When  User click on register button on home page and fill all required fields with valid credentials.

    Then  User register sucessfully
