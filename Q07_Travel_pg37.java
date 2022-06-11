import java.util.*;

class travel
{
    double ticket_charges;
    String name;
    double dis;
    double net_amount;
    
    travel(String name,double ticket_charges)
    {
        this.ticket_charges = ticket_charges;
        this.name = name;
    }
    
    void compute()
    {
        if(ticket_charges>70000)
            dis = ticket_charges*0.18;
        else if(ticket_charges>55000 && ticket_charges<=70000)
            dis = ticket_charges*0.16;
        else if(ticket_charges>35000 && ticket_charges<=55000)
            dis = ticket_charges*0.12;
        else if(ticket_charges>25000 && ticket_charges<=35000)
            dis = ticket_charges*0.10;
        else if(ticket_charges<=25000)
            dis = ticket_charges*0.02;
            
        net_amount = ticket_charges-dis;
    }
    
    void display()
    {
        System.out.println("Name is " + name);
        System.out.println("Ticket charge is " + ticket_charges);
        System.out.println("Discount is " + dis);
        System.out.println("Net Amount is " + net_amount);
    }
}


public class Main
{
	public static void main(String[] args) {
	    travel t ;
	    
	    Scanner sc = new Scanner(System.in);
	    Scanner s1 = new Scanner(System.in);
	    for(int i=0;i<15;i++)
	    {
	       double tc = sc.nextDouble();
	       String s = s1.nextLine();
	       
	        t = new travel(s, tc);
	        t.compute();
	        t.display();
	    }
	}
}
