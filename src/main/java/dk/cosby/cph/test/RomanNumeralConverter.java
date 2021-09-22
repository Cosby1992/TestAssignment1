package dk.cosby.cph.test;

/**
 * This class handles conversion from arabic numerals to roman numerals
 *
 * @author Anders, Dmitro, Ditlev
 */
public class RomanNumeralConverter {

        /**
         * Converts an integer to a roman numeral ie. input 9 returns "IX"
         * @param arabicNumeral the number to convert
         * @return the number converted to a roman numeral
         */
        public static String convert(int arabicNumeral){

                // Guard expression for negative numbers
                if(arabicNumeral < 0) return "Roman numerals does not support negative numbers";

                // StringBuilder to build and contain the result (Eg. "XIV")
                StringBuilder romanNumeralBuilder = new StringBuilder();

                // Checking all cases
                while(arabicNumeral >=  1000){ // counting M's (number of thousands)
                        romanNumeralBuilder.append("M");
                        arabicNumeral -= 1000;
                }
                if(arabicNumeral >=  900){ // counting CM's (number of nine hundreds)
                        romanNumeralBuilder.append("CM");
                        arabicNumeral -= 900;
                }
                if(arabicNumeral >= 500){ // counting D's (number of five hundreds)
                        romanNumeralBuilder.append("D");
                        arabicNumeral -= 500;
                }
                if(arabicNumeral >= 400){ // counting CD's (number of four hundreds)
                        romanNumeralBuilder.append("CD");
                        arabicNumeral -= 400;
                }
                while(arabicNumeral >= 100){ // counting C's (number of hundreds)
                        romanNumeralBuilder.append("C");
                        arabicNumeral -= 100;
                }
                if(arabicNumeral >= 90){ // counting XC's (number of nineties)
                        romanNumeralBuilder.append("XC");
                        arabicNumeral -= 90;
                }
                if(arabicNumeral >= 50){ // counting L's (number of fifties)
                        romanNumeralBuilder.append("L");
                        arabicNumeral -= 50;
                }
                if(arabicNumeral >= 40){ // counting XL's (number of forties)
                        romanNumeralBuilder.append("XL");
                        arabicNumeral -= 40;
                }
                while(arabicNumeral >= 10){ // counting X's (number of tens)
                        romanNumeralBuilder.append("X");
                        arabicNumeral -= 10;
                }
                if(arabicNumeral >= 9){ // counting IX's (number of nines)
                        romanNumeralBuilder.append("IX");
                        arabicNumeral -= 9;
                }
                if(arabicNumeral >= 5){ // counting V's (number of fives)
                        romanNumeralBuilder.append("V");
                        arabicNumeral -= 5;
                }
                if(arabicNumeral >= 4){ // counting IV's (number of fours)
                        romanNumeralBuilder.append("IV");
                        arabicNumeral -= 4;
                }
                while(arabicNumeral >= 1){ // counting I's (number of ones)
                        romanNumeralBuilder.append("I");
                        arabicNumeral--;
                }

                return romanNumeralBuilder.toString();
        }
}
