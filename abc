import java.lang.*;

class Overload 
{
    double series(double n)
    {
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + (1.0 / i);
        }
        //System.out.println("sum1 is " + sum);
        return sum;
    }
    
    double series(double a, double n)
    {
        double sum=0.0;
        double j=1.0,k=2.0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + (j/(Math.pow(a,k)));
            j = j+3;
            k = k+3;
        }
        //System.out.println("sum2 is " + sum);
        return sum;
    }
    
    public static void main(String[] args) 
    {
        Overload OL = new Overload();
        double result1;
        double result2;
        
        // For Series 1
        result1 = OL.series(2.0);
        // For Series 2
        result2 = OL.series(2.0,2.0);
        
        System.out.println(result1);
        System.out.println(result2);
    }
}
