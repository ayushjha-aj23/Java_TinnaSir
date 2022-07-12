/*
WAP to print the following Series
s = 1/2 + 2/3 + 3/4 + 4/5......n/n+1
*/

package com.class_8_practice;

        import java.util.Scanner;

public class Series_Q13 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); // Scanner used to take input from the user
        System.out.println("Enter a Number");
        float sum=0.0F,i;
        int n;
        n= sc.nextInt();
        for(i=1; i<=n;i++) {
            sum=sum+(i/(i+1));
            if(i!=n)
                System.out.print(i+"/"+(i+1)+" + ");
            if (i==n)
                System.out.println(i+"/"+(i+1));
        }
        System.out.println();
        System.out.println(sum);
    }
}