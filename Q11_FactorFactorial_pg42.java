import java.util.*;

public class Main
{
	public static void main(String[] args) {
	System.out.println("Press 1 For Factor of a Number");
        System.out.println("Press 2 For Factorial of a Number");
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
       
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        switch(choice)
        {
            case 1: 
                for(int i=1;i<n;i++)
                {
                    if(n%i==0)
                    {
                        System.out.println(i+ " ");
                    }
                }
                break;
            case 2:
                int p=1;
                for(int i=1;i<=n;i++)
                {
                    p = p*i;
                }
                System.out.println(p);
                break;
            default:
                System.out.println("Invalid Choice");
        }
	}
}
