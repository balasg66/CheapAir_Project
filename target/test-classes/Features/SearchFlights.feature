Feature: Search for Flights

  Scenario: Search for flights to book
    Given Launch the application
    When Select source and destination
    And Select departs and return dates
    And Click and Add traveler details
    And select classes
    And click search flights
    And see the Flight Results
    And check price and select lower price
    Then click continue and move to next page

  Scenario: Filling up traveller and payment details
    Given Land into Purchase page
    When Enter traveller details
      | firstname      | lastname    | day | year |
      | Balaji         | Govindasamy |  13 | 2000 |
      | Prakash        | Govindasamy |  12 | 2000 |
      | Sushmitha      | Uthayakumar |  28 | 2000 |
      | Mahalakshmi    | Subramani   |  14 | 2000 |
      | Swetha         | Uthayakumar |  10 | 2000 |
      | Govindasamy    | Sivalingam  |  10 | 1960 |
      | Dhanabhakkiyam | Govindasamy |  13 | 1960 |
      | Rithwik        | Prakash     |  23 | 2020 |
      | Dharwik        | Prakash     |  02 | 2023 |
    And Select payment and provide respective details
      | Cardnumber       | ccv | cardholder | address1 | address2 | city    | contactnumber | email          |
      | 2345098714783964 | 123 | Balaji     | katpadi  | vellore  | vellore |    9912992355 | bala@gmail.com |
    Then validate purchace
