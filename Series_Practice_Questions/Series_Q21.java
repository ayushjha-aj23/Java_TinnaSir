// WAP to print the following Series
// s = (1)+(1*2)+(1*2*3)+......nth term


package com.class_8_practice;

import java.util.Scanner;

public class Series_Q21 {

    public static void main(String[] args) {
        // write your code here
        int n;
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        n = sc.nextInt();
        int sum=0;
        int product=1;



        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                product=product*j;
            }
            sum=sum+product;
            product=1;
        }
        System.out.println();
        System.out.println("Sum is :"+sum);
    }
}