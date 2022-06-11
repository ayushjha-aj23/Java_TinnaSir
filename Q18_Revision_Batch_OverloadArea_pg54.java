
import java.lang.*;

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

        // Area of Circle
        result1 = OL.area(5.0);
        // Area of Square
        result2 = OL.area(5);
        // Area of Rectangle
        result3 = OL.area(5,10);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
