
import java.lang.*;
import java.util.Scanner;

class OverloadArea
{
    // Area of Circle
    double area(double r)
    {
        double area;
        area = 3.14*r*r;
        return area;
    }

    // Area of Square
    double area(int s)
    {
        double area;
        area = s*s;
        return area;
    }

    // Area of Rectangle
    double area(double length, double breadth)
    {
        double area;
        area = length*breadth;
        return area;
    }

    public static void main(String[] args)
    {
        OverloadArea OL = new OverloadArea();
        double result1;
        double result2;
        double result3;
        int choice;

        System.out.println("Press 1 for Area of Circle");
        System.out.println("Press 2 for Area of Square");
        System.out.println("Press 3 for Area of Rectangle");
        System.out.println("Enter your Choice");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                double r = sc.nextDouble();
                // Area of Circle
                result1 = OL.area(r);
                System.out.println(result1);
                break;

            case 2:
                int s = sc.nextInt();
                // Area of Circle
                result2 = OL.area(s);
                System.out.println(result2);
                break;

            case 3:
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                // Area of Circle
                result3 = OL.area(l, b);
                System.out.println(result3);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
