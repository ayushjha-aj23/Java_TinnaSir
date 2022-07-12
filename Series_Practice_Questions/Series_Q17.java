/*
WAP to print the following Series
s = 1*((x^2)/(3^1/2)) + 2*((x^2)/(4^1/2)) + 3*((x^3)/(5^1/2)) + ......nth term
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q17 {

    public static void main(String[] args) {
        // write your code here
        double sum = 0.0;
        int i;
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int x;
        x = sc.nextInt();
        Scanner sc_2 = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter the power of the Number");
        int n;
        n = sc_2.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + (i*Math.pow(x, i+1))/Math.pow(i+2,0.5);
            if (i != n)
                System.out.print(i+"*( (" + x + "^" + (i+1) + ") / (" + (i+2) + "^" + "1/2" + ") ) + ");
            if (i == n)
                System.out.println(i+" *( (" + x + "^" + (i+1) + ") / (" + (i+2) + "^" + "1/2" + ") )");
        }
        System.out.println();
        System.out.println(sum);
    }
}
