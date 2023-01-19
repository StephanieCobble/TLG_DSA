package com.algorithms;

import java.security.InvalidParameterException;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binary){
        int conversion = 1;
        int result = 0;
        /*
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        */
        if(binary == null || binary.length() == 0){
            throw new InvalidParameterException("Input must be 0's and 1s!");
        }

        for (int i = binary.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binary.charAt(i) > '1'){
                throw new InvalidParameterException(String.format("Input must be 0's and 1s!"));
            } else if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        int conversion = 1;
        int result = 0;
        if (octal == null || octal.length() ==0){
            throw new InvalidParameterException("Character index must not be null");
        }
        for (int i = octal.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (octal.charAt(i) > '8'){
                throw new InvalidParameterException("Character index must be between 0 and 7 inclusive!");
            } else {
                int num = Integer.parseInt(Character.toString(octal.charAt(i)));
                result += num*conversion;
                conversion *= 8;
            }
        }
        return result;
    }
}
