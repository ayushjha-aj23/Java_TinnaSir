import java.io.*;

class Employee
{
    int pan;
	String name;
	double tax_income, tax;
		
		void input() throws IOException 
		{
		    System.out.println("Enter your name, pan, annual income");
		    
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    name = br.readLine();
		    pan = Integer.parseInt(br.readLine());
		    tax_income = Double.parseDouble(br.readLine());
		}
		
		void calc()
		{
		    if(tax_income<=100000)
		        tax = 0.0;
		    else if(tax_income>100000 && tax_income<=150000)
		        tax = 0.10*(tax_income-100000);
		    else if(tax_income>150000 && tax_income<=250000)
		        tax = 0.20*(tax_income-150000) + 5000;
		    else if(tax_income>250000)
		        tax = 0.30*(tax_income-250000) + 25000;
		}
		
		void display()
		{
		    System.out.println("Pan Number \t Name \t Tax-Income \t Tax");
		    System.out.println(pan + "\t" + name + "\t" + tax_income + "\t" + tax);
		}
}

    public class Test{
            public static void main(String[] args) throws IOException {
    	    
    	    Employee emp = new Employee();
    	    emp.input();
    	    emp.calc();
    	    emp.display();
    	    }
    }
	
