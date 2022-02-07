// Program to implement calculator which can do any basic math operations on two numbers until the user exits out.
package com.akash;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while(true){
            System.out.print("Enter any operator(+, -, *, /, %) or X to exit : ");
            Scanner input = new Scanner(System.in);
            char opr = input.next().trim().charAt(0);

            if(opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
                int res = 0;
                System.out.print("Enter two numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(opr == '+'){
                    res = num1+num2;
                }
                if(opr == '-'){
                    res = num1-num2;
                }
                if(opr == '*'){
                    res = num1*num2;
                }
                if(opr == '/'){
                    if(num1>num2){
                        res = num1/num2;
                    }
                }
                if(opr == '%') {
                    res = num1 % num2;
                }
                System.out.println("Answer : " + res);
            }else if(opr == 'x' || opr == 'X'){
                break;
            }else{
                System.out.println("Invalid operator !");
            }
        }
    }
}
