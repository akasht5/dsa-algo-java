// Program to reverse elements of an array.

package com.akash;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // In this method we use two pointer technique and swap the elements
        int[] arr = { 18, 5, 10, 22, 101, 4, 36 };
        int start = 0, end = arr.length-1;

        System.out.println("Array before reversing the elements : " + Arrays.toString(arr));

        while(start<end){
            swap(arr, start, end);

            start++;
            end--;
        }

        System.out.println("Array after reversing the elements : " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    // Another method is to just add elements of the array
    // from the last position into a new array.
}
