// WAP to print the following Series
// s = [1]+[(1+2)/(1*2)]+[(1+2+3)/(1*2*3)]+......nth term


package com.class_8_practice;

import java.util.Scanner;

public class Series_Q22 {

    public static void main(String[] args) {
        // write your code here
        int n;
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        n = sc.nextInt();

        int internal_result=0;
        double external_result=0;
        int product=1;
        external_result=external_result+1; // For the First Time

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                //internal_sum=internal_sum+j;
                //internal_multiply=internal_multiply*j;
                internal_result =(j+(j+1))/(j*(j+1));
            }
            external_result=external_result+internal_result;
        }
        System.out.println(external_result);
    }
}