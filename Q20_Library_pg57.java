import java.util.Scanner;

public class Library {

	int acc_num;
	String title;
	String author;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		title = sc.nextLine();
		author = sc.nextLine();
		acc_num = sc.nextInt();
	}
	
	void compute()
	{
		System.out.println("Enter the Number of days late");
		Scanner sc2 = new Scanner(System.in);
		int days = sc2.nextInt();
		
		int charge = days*2;
		System.out.println("Days is " + days + " Charge is " + charge);
	}
	
	void display()
	{
		System.out.println("Account Number is " + acc_num);
		System.out.println("Tile is " + title);
		System.out.println("Author is " + author);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library L = new Library();
		L.input();
		L.compute();
		L.display();
	}

}
