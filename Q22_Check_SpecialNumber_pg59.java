import java.util.Scanner;

public class Check_SpecialNumber {
	
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp!=0)
		{
			int lastDigit = temp%10;
			int factorial = 1;
			
			
			for(int i=1;i<=lastDigit;i++)
			{
				factorial = factorial*i;
			}
			
			sum = sum + factorial;
			
			temp = temp/10;
		}
		
		if(sum == n)
			System.out.println(n + " is a Special Number");
		else 
			System.out.println(n + " is not a Special Number");
	}

}
