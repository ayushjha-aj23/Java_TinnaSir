import java.io.BufferedReader;
import java.util.Scanner;

public class Salary {

    String Name, Address, Subject;
    int PhoneNo;
    double monthlySalary, incomeTax;

    // Accept the Details of the Teacher
    void acceptDetail()
    {
        System.out.println("Enter Details-: Name, Address, Subject Specialization, Phone Number, Monthly Salary");

        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();
        Address = sc.nextLine();
        Subject = sc.nextLine();
        PhoneNo = sc.nextInt();
        monthlySalary = sc.nextDouble();
    }

    // To Display the Details
    void display()
    {
        System.out.println("Name is " + Name);
        System.out.println("Address is " + Address);
        System.out.println("Subject Specialization is " + Subject);
        System.out.println("Phone Number is " + PhoneNo);
        System.out.println("Monthly Salary is " + monthlySalary);
        System.out.println("Income Tax is " + incomeTax);
    }

    // To compute the annual income tax
    void compute()
    {
        double annual_salary = monthlySalary*12;
        if(annual_salary < 175000)
            incomeTax = 0.0;
        if(annual_salary > 175000)
            incomeTax = 0.05*(annual_salary-175000);
    }
    // Main method
    public static void main(String [] args) 
    {
        Salary S = new Salary();
        S.acceptDetail();
        S.compute();
        S.display();
    }
}
