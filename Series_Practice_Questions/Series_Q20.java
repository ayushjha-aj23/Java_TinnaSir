// WAP to input a real no. from the user and print its integer part and decimal part separately
// e.g. Input - 23.09
// Integer part - 23 and Decimal part - 09

package com.class_8_practice;

import java.util.Scanner;

public class Series_Q20 {

    public static void main(String[] args) {
        // write your code here
        //double sum = 0.0F;
        double integer_part=0;
        double decimal_part=0;
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        double n;
        n = sc.nextDouble();
        if(n>0)
        {
            integer_part=  Math.floor(n);
            decimal_part= (n-integer_part);
        }
        else if(n<0)
        {
            integer_part =  Math.ceil(n);
            decimal_part =  n-integer_part;
        }
        System.out.println("Integer Part is " + integer_part);
        System.out.println("Decimal Part is " + decimal_part);
    }
}