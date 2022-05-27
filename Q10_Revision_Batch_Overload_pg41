// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.lang.*;

class Overload 
{
    double area(double a, double b, double c)
    {
        double area;
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
    double area(int a, int b, int height)
    {
        double area;
        area = ((a+b)*height)/2;
        return area;
    }
    
    double area(double diagonal1, double diagonal2)
    {
        double area;
        area = (diagonal1*diagonal2)/2;
        return area;
    }
    
    public static void main(String[] args) 
    {
        Overload OL = new Overload();
        double result1;
        double result2;
        double result3;
        
        // Area of Scalene Triangle
        result1 = OL.area(5.0,6.0,7.0);
        // Area of Trapezium
        result2 = OL.area(7,3,12);
        // Area of Rhombus
        result3 = OL.area(5,10);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
