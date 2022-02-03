// Program to check whether the given character is small or capital.
// We can also use ASCII values to check it.

package com.akash;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        System.out.print("Enter any char : ");

        Scanner input = new Scanner(System.in);

        char alphabet = input.next().trim().charAt(0);

        if(alphabet>='a' && alphabet<='z'){
            System.out.println("Given character is small.");
        }else if(alphabet>='A' && alphabet<='Z'){
            System.out.println("Given character is capital.");
        }else{
            System.out.println("Given char is invalid.");
        }

        /*int alphabet = (int)(input.next().trim().charAt(0));

        System.out.println("ASCII Value : " + alphabet);
        if(alphabet>=65 && alphabet<=90){
            System.out.println("Given character is capital.");
        }else if(alphabet>=97 && alphabet<=122){
            System.out.println("Given character is capital.");
        }else{
            System.out.println("Given character is invalid.");
        }*/
    }
}
