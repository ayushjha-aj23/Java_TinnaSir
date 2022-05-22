import java.util.*;
import java.io.*;


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        char ch;
        s = s.toLowerCase();
        int l = s.length();
        
        for (int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )
                s = s.replace(ch,++ch);
        }
        
        System.out.println(s);
        
    }
}
