// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class OverloadString {
    
    void JoyString(String s, char ch1, char ch2)
    {
        String str;
        str = s.replace(ch1, ch2);
        
        System.out.println(str);
    }
    
    void JoyString(String s)
    {
        int p1, p2;
        p1 = s.indexOf(" ");
        p2 = s.lastIndexOf(" ");
        
        System.out.println("Position of First Space is " + p1);
        System.out.println("Position of Last Space is " + p2);
    }
    
    void JoyString(String s1, String s2)
    {
        String s;
        s = s1 + " " + s2;
        
        System.out.println("New String is " + s);
    }
    public static void main(String[] args) {
        OverloadString OLS = new OverloadString();
        
        OLS.JoyString("Technalagy", 'a', 'o');
        OLS.JoyString("Cloud Computing means Internet based Computing");
        OLS.JoyString("CommanWealth", "Games");
        
    }
}
