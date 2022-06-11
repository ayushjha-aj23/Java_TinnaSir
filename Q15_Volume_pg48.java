// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Volume {
    
    // Volume of Cube
    void cal_vol(int s)
    {
        double volume = s*s*s;
        System.out.println("Volume is " + volume);
    }
    
    // Volume of Sphere
    void cal_vol(double r)
    {
        double volume = (4/3.0)*3.14*r*r*r;
        System.out.println("Volume is " + volume);
    }
    
    // Volume of Cuboid 
    void cal_vol(int l, int b, int h)
    {
        int volume = l*b*h;
        System.out.println("Volume is " + volume);
    }
    
    public static void main(String[] args) {
        Volume v = new Volume();
        
        v.cal_vol(5);
        v.cal_vol(5.0);
        v.cal_vol(5, 6, 7);
        
    }
}
