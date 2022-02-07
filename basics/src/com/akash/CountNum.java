// Program to count the occurrences of a particular digit in a given number.

package com.akash;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("Now enter a digit from given number : ");
        int digit = input.nextInt();

        while(num>0){
            int rem = num % 10;
            if(rem == digit){
                count++;
            }

            num=num/10;
        }

        System.out.println("Digit occurs " + count + " times");
    }
}
