package com.akash;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Is the number prime : " + isPrime(num));
    }

    // This is the optimized algorithm for finding prime number.
    // Here it is only checking till the square root of given number(Square root method).
    static boolean isPrime(int n){
        int start = 2;
        while(start*start <= n){
            if(n%start == 0){
                return false;
            }
            start++;
        }

        return start*start > n;
    }
}