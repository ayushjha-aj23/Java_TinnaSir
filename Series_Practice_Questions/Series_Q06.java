// WAP to print the following Series
// a,b,c.....j (if j is the inputted Alphabet from the user)

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q6 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter an Alphabet");
        char n;
        n = sc.next().charAt(0);
        for(char i = 'a'; i < n;i++) {
            System.out.print(i +",");
        }
        System.out.println(n);

    }
}