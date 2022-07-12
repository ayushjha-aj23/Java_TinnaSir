// WAP to print squares of numbers in a Series up to n
// 1,4,9....n^2

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q3 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        int n,a;
        n= sc.nextInt();
        for(int i = 1; i <n; i++) {
            a=i*i;
            System.out.print(a+",");
        }
        System.out.println(n*n);
    }
}
