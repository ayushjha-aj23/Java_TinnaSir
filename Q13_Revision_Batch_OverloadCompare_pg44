import java.lang.*;

class Overload 
{
    void compare(int a, int b)
    {
        if(a>b)
            System.out.println("Greater Number is " + a);
        else
            System.out.println("Greater Number is " + b);
    }
    
    void compare(char ch_a, char ch_b)
    {
        if((int) ch_a > (int) ch_b)
            System.out.println("Character with the higher numeric value is " + ch_a);
        else
            System.out.println("Character with the higher numeric value is " + ch_b);
    }
    
    void compare(String Str_a, String Str_b)
    {
        if(Str_a.length()>Str_b.length())
            System.out.println("Longer String is " + Str_a);
        else
            System.out.println("Longer String is " + Str_b);
    }
    
    public static void main(String[] args) 
    {
        Overload OL = new Overload();
        
        // For 1st Compare method
        OL.compare(45, 96);
        // For 2nd Compare method
        OL.compare('z', 'w');
        // For 3rd Compare method
        OL.compare("Ayush", "Aman");
    }
}
