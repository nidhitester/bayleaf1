Feature:Accepect terms and condition
  @acceptance
  Scenario: User needed to accept terms and conditions

    Given  User already on home page
    When   User click on books
    And    Click on add to cart of selected book
    And    User click on shopping cart
    And    User click on checkout button without accepting terms and condition
    Then   User not able to do checkout
    And    Warning message displayed to accept terms and conditions

