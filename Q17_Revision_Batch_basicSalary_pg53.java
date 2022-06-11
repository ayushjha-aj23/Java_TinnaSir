import java.util.Scanner;

public class Employee {
    public static void main(String[] args)
    {
        double basicSalary;

        Scanner sc = new Scanner(System.in);
        basicSalary = sc.nextDouble();

        double dearnessAllowance = 0.25*basicSalary;
        double houseRentAllowance = 0.15*basicSalary;
        double providentFund = 0.0833*basicSalary;
        double netPay = basicSalary+dearnessAllowance+houseRentAllowance;
        double grossPay = netPay-providentFund;

        System.out.println("The Gross Pay is " + grossPay);
    }
}
