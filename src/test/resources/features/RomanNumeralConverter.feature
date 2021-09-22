
  Feature: Convert Arabic numerals to Roman numerals

    Scenario Outline: Convert Arabic numerals to Roman numerals
      Given a positive number <integer>
      When converting to roman numerals
      Then the result should be <roman numeral>
      Examples:
        | integer | roman numeral        |
        | 1       | "I"                  |
        | 2       | "II"                 |
        | 3       | "III"                |
        | 4       | "IV"                 |
        | 5       | "V"                  |
        | 6       | "VI"                 |
        | 7       | "VII"                |
        | 8       | "VIII"               |
        | 9       | "IX"                 |
        | 10      | "X"                  |
        | 19      | "XIX"                |
        | 20      | "XX"                 |
        | 25      | "XXV"                |
        | 50      | "L"                  |
        | 100     | "C"                  |
        | 111     | "CXI"                |
        | 134     | "CXXXIV"             |
        | 222     | "CCXXII"             |
        | 333     | "CCCXXXIII"          |
        | 419     | "CDXIX"              |
        | 444     | "CDXLIV"             |
        | 500     | "D"                  |
        | 555     | "DLV"                |
        | 558     | "DLVIII"             |
        | 666     | "DCLXVI"             |
        | 777     | "DCCLXXVII"          |
        | 800     | "DCCC"               |
        | 832     | "DCCCXXXII"          |
        | 888     | "DCCCLXXXVIII"       |
        | 923     | "CMXXIII"            |
        | 986     | "CMLXXXVI"           |
        | 999     | "CMXCIX"             |
        | 1000    | "M"                  |
        | 1111    | "MCXI"               |
        | 2000    | "MM"                 |
        | 2222    | "MMCCXXII"           |
        | 3333    | "MMMCCCXXXIII"       |
        | 4444    | "MMMMCDXLIV"         |
        | 5555    | "MMMMMDLV"           |
        | 6666    | "MMMMMMDCLXVI"       |
        | 9876    | "MMMMMMMMMDCCCLXXVI" |

    Scenario: Convert Arabic numeral 0 to Roman numeral
      Given a positive number 0
      When converting to roman numerals
      Then the result should be ""



