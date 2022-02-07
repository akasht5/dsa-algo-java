// Program to reverse digits of a given number.

package com.akash;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int rev = 0;
        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while(num>0){
            int rem = num%10;
            int res = (rev*10)+rem;
            num=num/10;
            rev = res;
        }

        System.out.println("The reverse of the given number : "+rev);
    }
}
