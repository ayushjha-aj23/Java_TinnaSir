/*
 WAP to print the following Series
 1,12,123,1234.....n
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q8 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter the Number of Times you want to print the Series");
        int n,i;
        int p=0;
        n= sc.nextInt();
        for(i = 1; i <n;i++) {
            p=p*10+i;
            System.out.print(p+",");
        }
        System.out.println((p*10)+i);
    }
}

