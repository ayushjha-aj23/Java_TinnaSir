// WAP to print n numbers in a Series
// 1,2,3.....n

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q1 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int n;
        n= sc.nextInt();
        for(int i = 1; i <n;i++) {
            System.out.print(i+",");
        }
        System.out.println(n);
    }
}
