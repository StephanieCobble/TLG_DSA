package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        int counter = 0;
        for (int x : a) {
            for (int y : b) {
                counter++;
                if (x == y) result.add(x);
            }
        }
        System.out.printf("Total slow: %s ", counter);
        return result;
    }

	public List<Integer> intersectionFast(int[]a, int[]b){
        int counter = 0;
        // sorting the arrays using QuickSort
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> intersectionList = new ArrayList<>();
        // initialize int index for each array, start at 0
        int indexA = 0;
        int indexB = 0;

        while (indexA < a.length && indexB < b.length){
            counter++;
            if (a[indexA] == b[indexB]){
                intersectionList.add(a[indexA]);
                indexA++;
                indexB++;
            } else if (a[indexA] < b[indexB]){
                indexA++;
            } else {
                indexB++;
            }
        }
        System.out.printf("Total fast: %s ", counter);
        return intersectionList;
	}

    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));

        int[] num1 = new int[]{43, 92, 1, 46, 73, 22};
        int[] num2 = new int[]{23, 65, 3, 43, 18, 75};

        List<Integer> res = new Intersection().intersectionFast(num1, num2);
        System.out.println(res);
    }
}
