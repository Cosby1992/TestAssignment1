package dk.cosby.cph.test;

public class RomanNumeralConverter {

        public static String convert(int arabicNumeral){


                return switch (arabicNumeral) {
                        case 1 -> "I";
                        case 5 -> "V";
                        case 10 -> "X";
                        case 50 -> "L";
                        case 100 -> "C";
                        case 500 -> "D";
                        case 1000 -> "M";
                        default -> "default";
                };


        }
}
