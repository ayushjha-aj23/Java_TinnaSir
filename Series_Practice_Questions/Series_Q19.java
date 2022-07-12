/*
WAP to print the following Series
s = ((x^1)^(1/2)) + ((x^2)^(1/2)) + ((x^3)^(1/2))......nth term
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q19 {

    public static void main(String[] args) {
        // write your code here
        float sum = 0.0F;
        int factorial=1;
        int i;
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int n;
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                factorial=factorial*j;
            }
            sum=sum+factorial;
            factorial=1;
            if (i != n)
                System.out.print(i+"!"+"+");
            if (i == n)
                System.out.println(i+"!");
        }
        System.out.println();
        System.out.println(sum);
    }
}
