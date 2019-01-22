  Feature:Email a friend
  @email
  Scenario: Unregistered user not able to sent email

    Given User on home page
    When  User click on apparel
    And   user click  shoes category
    And   User click Nike Floral Roshe Customized Running Shoes
    And   User click on email a friend button
    And   User input all email fields
    And   User click on send email button
    Then  User not able to send the email
