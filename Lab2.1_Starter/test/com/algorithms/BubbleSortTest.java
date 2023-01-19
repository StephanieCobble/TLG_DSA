package com.algorithms;

import org.junit.Test;

import java.util.InvalidPropertiesFormatException;

import static org.junit.Assert.*;

public class BubbleSortTest {
    // TODO-Lab2.1: Implement tests
    // Empty array
    @Test
    public void  sort_whenArrayIsEmpty_shouldDoNothing(){
        int[] numbers = {};
        BubbleSort.sort(numbers);
        assertEquals(0, numbers.length);
    }

    //Null array
    @Test(expected = IllegalArgumentException.class)
    public void sort_whenArrayIsNull(){
        int arr[] = null;
        BubbleSort.sort(arr);
        int[] actual = null;
        int[] expected = null;
        assertEquals(expected, actual);
    }

    // array that has been sorted
    @Test
    public void sort_whenArrayValuesAreSorted(){
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        int[] expected = numbers.clone();
        BubbleSort.sort(numbers);
        assertArrayEquals(numbers, expected);
    }

    //array of equal values
    @Test
    public void sort_whenArrayValuesAreEqual_shouldRemainUnchanged(){
        int[] numbers = new int[] {1, 1, 1, 1, 1, 1};
        int[] expected = numbers.clone();
        BubbleSort.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}