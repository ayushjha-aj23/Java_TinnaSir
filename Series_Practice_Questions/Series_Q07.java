/*
 WAP to print the following Series
 1,11,111,1111.....n
*/

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q7 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter the Number of Times you want to print the Series");
        int n,a=0;
        n= sc.nextInt();
        for(int i = 1; i <n;i++) {
            a=a*10+1;
            System.out.print(a+",");
        }
        System.out.println((a*10)+1);
    }
}
