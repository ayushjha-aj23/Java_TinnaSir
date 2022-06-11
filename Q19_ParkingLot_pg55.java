import java.util.Scanner;

public class ParkingLot {

	int vno;
	int hours;
	double bill;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		vno = sc.nextInt();
		hours = sc.nextInt();
	}
	
	void calculate()
	{
		if(hours==1)
			bill = 3.0;
		
		if(hours>1)
			bill = 3.0 + 1.50*(hours-1);
	}
	
	void display()
	{
		System.out.println("Vechile Number is " + vno);
		System.out.println("Hours Parked is " + hours);
		System.out.println("Bill is " + bill);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParkingLot PL = new ParkingLot();
		
		PL.input();
		PL.calculate();
		PL.display();
	}

}
