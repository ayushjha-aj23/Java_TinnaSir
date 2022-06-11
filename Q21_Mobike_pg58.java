import java.util.Scanner;

public class Mobike {

	int bno;
	int phoneno;
	String name;
	int days;
	int charge;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		days = sc.nextInt();
		bno = sc.nextInt();
		phoneno = sc.nextInt();
		
	}
	
	void compute()
	{
		if(days<5)
			charge = days*500;
		else if(days>5 && days<10)
			charge = days*400;
		else if(days>10)
			charge = days*200;
	}
	
	void display()
	{
		System.out.println("Bike Number is " + bno);
		System.out.println("Phone Number is " + phoneno);
		System.out.println("Name is " + name);
		System.out.println("Days is " + days);
		System.out.println("Charge is " + charge);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobike M = new Mobike();
		M.input();
		M.compute();
		M.display();
	}

}
