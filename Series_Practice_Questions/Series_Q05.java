// WAP to print a Series up to n
// Series e.g. 0.,4,18,48.....(n^3-n^2)
// number power 3 - number power 2

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q5 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        double n;
        n= sc.nextDouble();
        for(int i = 1; i < n;i++) {
            System.out.print( (Math.pow(i,3.0)-Math.pow(i,2) ) +",");
        }
        System.out.println( (Math.pow(n,3.0)-Math.pow(n,2) ) );

    }
}
