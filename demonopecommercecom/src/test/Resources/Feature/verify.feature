  Feature: verify category list
    @verify
   Scenario: verify all category present on home page working as expected
    Given user already on homepage
    When user click on computer
    Then  user navigate to computer page

    @verify
    Scenario: verify all category present on home page working as expected
      Given user already on homepage
      When user click on jewelry
      Then  user navigate to jewelry page


    @verify
    Scenario: verify all category present on home page working as expected
    Given user already on homepage
    When user click on books
    Then  user navigate to books page

    @verify
    Scenario: verify all category present on home page working as expected
      Given user already on homepage
      When user click on giftcard
      Then  user navigate to giftcard page

    @verify
    Scenario: verify all category present on home page working as expected
      Given user already on homepage
      When user click on electronics
      Then  user navigate to electronics page

    @verify
    Scenario: verify all category present on home page working as expected
      Given user already on homepage
      When user click on apparel
      Then  user navigate to apparel page

    @verify
    Scenario: verify all category present on home page working as expected
      Given user already on homepage
      When user click on digitaldownload
      Then  user navigate to digitaldownload page