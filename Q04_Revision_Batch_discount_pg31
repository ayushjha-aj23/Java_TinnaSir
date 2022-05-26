import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	double amount = Double.parseDouble(br.readLine());
	double discount=0.0;
	
	if(amount<2000)
	    discount = 0.05*amount;
	else if(amount>=2001 && amount<=5000)
	    discount = 0.25*amount;
	else if(amount>=5001 && amount<=10000)
	    discount = 0.35*amount;
	else if (amount>10000)
	    discount = 0.50*amount;
	
	double net_amount = amount-discount;
	System.out.println("Net Amount to be Paid is " + net_amount);
	    
    }
}
