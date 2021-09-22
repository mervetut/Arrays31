package com.company;

public class Main {

    public static void main(String[] args) {
        int[] values = new int[]{-3, 2, 5, 4, 7};
        boolean result = true;
        int n = 1;

        while (result && n < 5) {
            if (values[n] < values[n - 1])
                result = false;
            n++;
        }
        System.out.println(result);
    }
}
//if (array[0] >= array[1] &&
//                array[n - 2] >= array[n - 1]);
//        System.out.println();