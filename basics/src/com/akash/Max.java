// Program to find max element of an array

package com.akash;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 29, 39, 1, 37, 902, 104, 66, 3, 74 };

        int max = arr[0];
        for(int i = 1; i<=arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Max element : " + max);
    }
}
