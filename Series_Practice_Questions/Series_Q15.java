/*
WAP to print the following Series
s=1-2+3-4+5........nth Term
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q15 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int n,i,sum=0;
        n= sc.nextInt();
        for(i=1; i<=n;i++) {
            if (i!=n) {
                if(i%2==0) {
                    System.out.print(i + "+");
                    sum=sum-i;
                }
                else{
                    System.out.print(i+"-");
                    sum=sum+i;
                }
            }
            else{
                if(i%2==0) {
                    System.out.print(i);
                    sum=sum-i;
                }
                else{
                    System.out.print(i);
                    sum=sum+i;
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}

