// Program to find largest number from given three numbers

package com.akash;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter three numbers : ");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max=num1;
        if(num2 > num1) {
            max = num2;
        }
        if(num3>num2){
            max=num3;
        }

        System.out.println("Largest number from given numbers : " + max);
    }
}
