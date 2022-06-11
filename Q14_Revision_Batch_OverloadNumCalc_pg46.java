
public class Overload {

	void num_calc(int num, char ch)
	{
		if(ch=='s')
		{
			int square = num*num;
			System.out.println("The Square is " + square);
		}
		else
		{
			int cube = num*num*num;
			System.out.println("The Cube is " + cube);
		}
	}
	
	void num_calc(int a, int b, char ch)
	{
		if(ch=='p')
		{
			int product = a*b;
			System.out.println("The Product is " + product);
		}
		else
		{
			int sum = a+b;
			System.out.println("The Sum is " + sum);
		}
	}
	
	void num_calc(String Str1, String Str2)
	{
		if(Str1.equalsIgnoreCase(Str2))
			System.out.println("Both the String are Equal");
		else
			System.out.println("Both the String are Not Equal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload OL = new Overload();
		
		// For 1st num_calc 
		OL.num_calc(5, 's');
		OL.num_calc(5, 'a');
		
		// For 2nd num_calc 
		OL.num_calc(2, 3, 'p');
		OL.num_calc(2, 3, 'a');
		
		// For 3rd num_calc 
		OL.num_calc("Ayush Jha", "AYUSH JHA");
		OL.num_calc("Ayush Jha", "A J");

	}

}
