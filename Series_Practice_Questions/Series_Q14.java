/*
WAP to print the following Series
s=0,1,1,2,3,5........nth Term
Also called Fibonacci Series
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q14 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int n,i,sum=0;
        int a=0,b=1,c=0;
        n= sc.nextInt();
        System.out.print(a+","+b+",");
        for(i=0; i<n-2;i++) {
            c=a+b;
            sum=sum+c;
            if(i<n-3)
                System.out.print(c+",");
            if (i==n-3)
                System.out.print(c);
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println(sum+1);// Here +1 is increased because of the 2nd term
    }
}
