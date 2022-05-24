import java.util.*;
public class Main
{
	void checkPrime(int n)
	{
	    int count = 0;
	    for(int i=2;i*i<=n;i++)
		{
		    
		            if(n%i==0)
		            {
		                count++;
		                break;
		            }
		}
		            
		            if(count == 0)
		                System.out.println("Prime Number");
		            else 
		                System.out.println("Not a Prime Number");
	}
	
	void checkAutomorphic(int n)
	{
	    int square = n*n;
	    int number_of_digits = 0;
	    int num = n;
	    
	    while (num!=0)
	    {
	        number_of_digits++;
	        num = num/10;
	    }
	    
	    int temp = (int) Math.pow(10,number_of_digits);
	    
	    int rem = square%temp;
	    
	    //System.out.println(rem);
	    if(n==rem)
	        System.out.println("Automorphic Number");
	    else 
	        System.out.println("Not an Automorphic Number");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Press 1 to check Prime Number");
		System.out.println("Press 2 to check Automorphic Number");
		System.out.println("Press 3 to exit");
		System.out.println("Enter your choice");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		 Main m = new Main();
		
		switch(choice)
		{
		    case 1:
		        m.checkPrime(n);
		        break;
		    case 2:
		        m.checkAutomorphic(n);
		        break;
		    case 3:
		        System.exit(0);
		    default:
		        System.out.println("Invalid Choice");
		        break;
		}
		
	}
}
