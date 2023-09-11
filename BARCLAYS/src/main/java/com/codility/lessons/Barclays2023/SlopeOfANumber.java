package com.codility.lessons.Barclays2023;

public class SlopeOfANumber {
    
    public int solution1(String S) {
        int slope = 0;
        char[] numCharArr = S.toCharArray();
        int length = numCharArr.length;
        // loop from the second digit till the last second digit.
        for (int i = 1; i < length - 1; i++) {
            // finding the maxima
            if ((Character.getNumericValue(numCharArr[i]) > Character.getNumericValue(numCharArr[i - 1]))
                    &&
                    (Character.getNumericValue(numCharArr[i]) > Character.getNumericValue(numCharArr[i + 1]))) {
                slope++;
            }
            // finding minima
            else if ((Character.getNumericValue(numCharArr[i]) < Character.getNumericValue(numCharArr[i - 1]))
                    &&
                    (Character.getNumericValue(numCharArr[i]) < Character.getNumericValue(numCharArr[i + 1]))) {
                slope++;
            }
        }
        return slope;
    }

    public int solution2(int num) throws NumberFormatException {
        int slope = 0;
        String strNum = "" + num;
        int strLength = strNum.length();
        // loop from the second digit till the last second digit.
        for (int i = 1; i < strLength - 1; ++i) {
            // finding the maxima
            //int digitMinusOne = Integer.parseInt(strNum.charAt(i - 1));
            int digitMinusOne = Character.getNumericValue(strNum.charAt(i - 1));            
            //int digit = Integer.parseInt(strNum.charAt(i));
            int digit = Character.getNumericValue(strNum.charAt(i));            
            //int digitPlusOne = Integer.parseInt(strNum.charAt(i + 1));
            int digitPlusOne = Character.getNumericValue(strNum.charAt(i + 1));            
            // finding the maxima
            if (
                (digit > digitMinusOne)
                        &&
                        (digit > digitPlusOne)
            ) {
                slope++;
            }
            // finding minima
            else if (
                (digit < digitMinusOne)
                        &&
                        (digit < digitPlusOne)
            ) {
                slope++;
            }
        }
        return slope;
    }
}
