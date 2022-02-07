// Program to swap elements in an array.

package com.akash;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 18, 5, 10, 22, 101, 4, 36 };

        swap(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
