/*
WAP to print the following Series
s = ((x^1)/(1^1/2)) + ((x^2)/(2^1/2)) + ((x^3)/(3^1/2)) + ......nth term
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q16 {

    public static void main(String[] args) {
        // write your code here
        double sum=0.0;
        int i;
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int x;
        x= sc.nextInt();
        Scanner sc_2 = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter the power of the Number");
        int n;
        n= sc_2.nextInt();
        for(i=1; i<=n;i++) {
            sum=sum+Math.pow(x,i)/Math.pow(i,0.5);
            if(i!=n)
                System.out.print("( ("+x+"^"+i+") / ("+i+"^"+"1/2"+") ) + ");
            if (i==n)
                System.out.println("( ("+x+"^"+i+") / ("+i+"^"+"1/2 ) )");
        }
        System.out.println();
        System.out.println(sum);
    }
}