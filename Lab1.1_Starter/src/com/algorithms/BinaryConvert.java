package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary){
        int res = 0;
        int num = 1;
        for (int i = binary.length()-1; i>=0; i--) {
            if (binary.charAt(i) == '1'){
                res += num;
            }
            num *= 2;
//            res += binary.charAt(i) * num;
//            num = num*2;
        }

        return res;
    }

}
