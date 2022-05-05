import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int choice;
	double C,F;
	
	System.out.println("Enter your Choice");
	System.out.println("Press 1 TO Convert temperature from Fahrenheit to Degree Celsius");
	System.out.println("Press 2 TO Convert temperature from Degree Celsius to Fahrenheit");
	
	choice = Integer.parseInt(br.readLine());
	
	switch(choice)
	{
	    case 1:
	        System.out.println("Enter Temperature in Fahrenheit");
	        F = Double.parseDouble(br.readLine());
	        
	        C = (5.0/9)*(F-32);
	        
	        System.out.println("Temperature in Degree Celsius is " + C);
	        break;
	   case 2: 
	       System.out.println("Enter Temperature in Degree Celsius");
	        C = Double.parseDouble(br.readLine());
	        
	        F = 1.8*C+32;
	        
	        System.out.println("Temperature in Fahrenheit is " + F);
	        break;
	   default:
	        System.out.println("Invalid Choice");
	        
	}
	
    }
}
