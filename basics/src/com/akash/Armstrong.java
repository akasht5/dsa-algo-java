package com.akash;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int original_num = input.nextInt();
        int num = original_num;
        int sum=0;

        while(num>0){
            int rem = num%10;
            num = num/10;

            int res = rem*rem*rem;
            sum += res;
        }

        if(original_num == sum){
            System.out.println("The given number is an Armstrong number.");
        }else{
            System.out.println("The given number is not an Armstrong number.");
        }
    }

}
