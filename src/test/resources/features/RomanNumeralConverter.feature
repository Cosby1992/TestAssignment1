
  Feature: Convert Arabic numerals to Roman numerals

    Scenario Outline: Convert Arabic numerals to Roman numerals
      Given a positive number <integer>
      When converting to roman numerals
      Then the result should be <roman numeral>
      Examples:
        | integer | roman numeral |
        | 1       | "I"           |
        | 2       | "II"          |
        | 3       | "III"         |
        | 4       | "IV"          |
        | 5       | "V"           |
        | 6       | "VI"          |
        | 7       | "VII"         |
        | 8       | "VIII"        |
        | 9       | "IX"          |
        | 10      | "X"           |
        | 19      | "IX"          |
        | 20      | "XX"          |
        | 25      | "XV"          |
        | 50      | "L"           |
        | 100     | "C"           |
        | 134     | "CXXXIV"      |
        | 500     | "D"           |
        | 800     | "DCCC"        |
        | 1000    | "M"           |
        | 2000    | "MM"          |

