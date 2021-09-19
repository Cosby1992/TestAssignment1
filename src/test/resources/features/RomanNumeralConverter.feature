
  Feature: Convert Arabic numerals to Roman numerals

    Scenario Outline: Convert Arabic numerals to Roman numerals
      Given a positive number <integer>
      When converting to roman numerals
      Then the result should be <roman numeral>
      Examples:
        | integer | roman numeral |
        | 1       | "I"           |

