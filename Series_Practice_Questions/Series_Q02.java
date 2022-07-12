// WAP to print Even Numbers in a Series up to n
// 2,4,6.....n

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q2 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter an Even Number");
        int n;
        n= sc.nextInt();
        for(int i = 2; i <n;i+=2) {
            System.out.print(i+",");
        }
        System.out.println(n);

    }
}