package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctalToDecimal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binaryString){
        int conversion = 1;
        int result = 0;
        /*
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        */
        // this could be a preferred solution: decrement from last element
        for (int i = binaryString.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binaryString.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctalToDecimal(String octalString) {
        int res = 0;
        int num = 1;
        // Possible numbers: 0,1,2,3,4,5,6,7
        for (int i = octalString.length()-1; i>=0; i--) {
            int octNum = Integer.parseInt(Character.toString(octalString.charAt(i)));
            res += octNum*num;
            num *= 8;
        }
        return res;
    }

/*
Write generic conversion code that handles all number systems: binary, octal, decimal,
hexadecimal without using Integer.parseInt(String s, int radix) method – it is just
too simple an exercise, then -  but you can use Integer.parseInt(String s), however.
 */
    public static int convertFromGeneral(String toBeConvertedNumberString, int numberBase) {
        int decimalValueResult = 0;
//        numberBase = 2,8,10,16;

        return decimalValueResult;

    }
}
