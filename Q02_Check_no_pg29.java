import java.util.*;
import java.io.*;
//import java.lang.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n;
	
	System.out.println("Press 1 To check whether number is Pallindrme or not");
	System.out.println("Press 2 To check whether number is Perfect or not");
	System.out.println("Enter your choice");
	
	int choice = Integer.parseInt(br.readLine());
	
	switch(choice)
    	{
    	    case 1:
    	        System.out.println("Enter a number");
		n = Integer.parseInt(br.readLine());
		int num = n;
    	        int rem=0,rev=0;
    	        
    	        while(num!=0)
    	        {
    	            rem = num%10;
    	            rev = (rev*10)+rem;
    	            num = num/10;
    	            
    	        }
    	        
    	        if(rev==n)
    	            System.out.println("Palindrom Number");
    	       else
    	            System.out.println("Not a Palindrome Number");
    	       break;
    	    case 2: 
	    	System.out.println("Enter a number");
		n = Integer.parseInt(br.readLine());
    	        int sum =0;
    	        for(int i=1;i<n;i++)
    	        {
    	            if(n%i==0)
    	            sum = sum + i;
    	        }
    	            
    	            if(sum == n)
    	                System.out.println("Perfect Number");
    	            else
    	                System.out.println("Not a Perfect Number");
    	            break;
    	    default:
    	            System.out.println("Invalid Choice");
    	}
    }
}
