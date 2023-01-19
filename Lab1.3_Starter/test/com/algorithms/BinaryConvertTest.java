package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class BinaryConvertTest {
//    BinaryConvert binaryConvert;
//
//    @Before
//    public void setUp(){
//        binaryConvert = new BinaryConvert();
//    }
    @Test
    public void convertFromBinary_shouldReturnCorrectDecimal() {
        String[] binaryStrings = {"100101", "101", "1011"};
        int[] expectedResults = {37, 5, 11};

        for (int i = 0; i < binaryStrings.length; i++) {
            int actual = BinaryConvert.convertFromBinary((binaryStrings[i]));
            assertEquals(expectedResults[i], actual);
        }
    }

    @Test(expected = InvalidParameterException.class)
    public void _convertFromBinary_shouldThrowExceptionWhenInvalidCharPassed() {
        String[] binaryStrings = {"22222", "22", "222"};
        for (String binary : binaryStrings) {
            BinaryConvert.convertFromBinary(binary);
        }
    }

    @Test
    public void _convertFromBinary_shouldThrowExceptionWhenValuesAreZero(){
        String[] binaryStrings = {"000", "0000", "00"};
        for (String binary : binaryStrings) {
            assertEquals(0, BinaryConvert.convertFromBinary(binary));
        }
    }

    @Test(expected = InvalidParameterException.class)
    public void _convertFromBinary_shouldThrowExceptionWhenValuesAreNullOrEmpty(){
        String binaryString = null;
        BinaryConvert.convertFromBinary(binaryString);
    }

    @Test(expected = InvalidParameterException.class)
    public void _convertFromBinary_shouldThrowExceptionWhenStringEmpty(){
        String binaryString = "";
        BinaryConvert.convertFromBinary(binaryString);
    }

    // tests for octal
    @Test
    public void convertFromOctal_shouldReturnCorrectDecimal() {
        String[] octalStrings = {"17", "217"};
        int[] expectedRes = {15, 143};
        for (int i = 0; i < octalStrings.length; i++){
            int actual = BinaryConvert.convertFromOctal(octalStrings[i]);
            assertEquals(expectedRes[i], actual);
        }
    }

    @Test(expected = InvalidParameterException.class)
    public void _convertFromOctal_shouldThrowExceptionWhenInvalidCharPassed(){
        String[] octalStrings = {"999", "99"};
        for (String octal : octalStrings){
            BinaryConvert.convertFromOctal(octal);
        }
    }

    @Test
    public void _convertFromOctal_shouldThrowExceptionWhenValuesAreZero(){
        String[] octalStrings = {"000", "0000", "00"};
        for (String octal : octalStrings) {
            assertEquals(0, BinaryConvert.convertFromOctal(octal));
        }
    }

    @Test(expected = InvalidParameterException.class)
    public void _convertFromOctal_shouldThrowExceptionWhenValuesAreNullOrEmpty(){
        String octalStrings = null;
        BinaryConvert.convertFromOctal(octalStrings);
    }

    @Test(expected = InvalidParameterException.class)
    public void _convertFromOctal_shouldThrowExceptionWhenStringEmpty(){
        String octalStrings = "";
        BinaryConvert.convertFromOctal(octalStrings);
    }
}