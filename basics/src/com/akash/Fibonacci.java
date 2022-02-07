// Program to print fibonacci series till the given number.

package com.akash;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int sum, count=2;

        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("Fibonacci series : 0 1 ");

        while(count <= num){
            sum = n1 + n2;
            System.out.print(sum+" ");
            n1 = n2;
            n2 = sum;

            // Second approach
            /*int temp = n2;
            n2 = n2 + n1;
            n1 = temp;*/

            count++;
        }
    }
}