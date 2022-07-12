// WAP to print Odd Number in a Series up to n
// 1,3,5....n

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q4 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a odd Number");
        int n;
        n= sc.nextInt();
        for(int i = 1; i <n;i+=2) {
            System.out.print(i+",");

        }
            System.out.println(n);

    }
}