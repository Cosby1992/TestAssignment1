package dk.cosby.cph.test;

public class RomanNumeralConverter {

        public static String convert(int arabicNumeral){

                StringBuilder romanNumeralBuilder = new StringBuilder();

                while(arabicNumeral >=  1000){
                        romanNumeralBuilder.append('M');
                        arabicNumeral -= 1000;
                }
                while(arabicNumeral >= 500){
                        romanNumeralBuilder.append('D');
                        arabicNumeral -= 500;
                }
                while(arabicNumeral >= 100){
                        romanNumeralBuilder.append('C');
                        arabicNumeral -= 100;
                }
                while(arabicNumeral >= 50){
                        romanNumeralBuilder.append('L');
                        arabicNumeral -= 50;
                }
                while(arabicNumeral >= 10){
                        romanNumeralBuilder.append('X');
                        arabicNumeral -= 10;
                }
                while(arabicNumeral >= 5){
                        romanNumeralBuilder.append('V');
                        arabicNumeral -= 5;
                }
                while(arabicNumeral >= 1){
                        romanNumeralBuilder.append('I');
                        arabicNumeral -= 1;
                }

                return romanNumeralBuilder.toString();
        }
}
