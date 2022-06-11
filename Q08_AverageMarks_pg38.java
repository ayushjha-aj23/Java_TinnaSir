import java.util.*;
public class Student
{
	String name;
	int age,m1,m2,m3,max_marks;
	double average;
	
	Student(String name, int age, int m1, int m2, int m3)
	{
	    this.name = name;
	    this.age = age;
	    this.m1 = m1;
	    this.m2 = m2;
	    this.m3 = m3;
	}
	
	void accept()
	{
	    Scanner sc = new Scanner(System.in);
	    
	    name = sc.nextLine();
	    age = sc.nextInt();
	    m1 = sc.nextInt();
	    m2 = sc.nextInt();
	    m3 = sc.nextInt();
	}
	
	void compute()
	{
	    if(m1>=m2 && m1>=m3)
	        max_marks = m1;
	   if(m2>=m1 && m2>=m3)
	        max_marks = m2;
	   if(m3>=m1 && m3>=m2)
	        max_marks = m3;
	   
	   average = (m1+m2+m3)/3.0;
	}
	
	void display()
	{
	    System.out.println("Maximum Marks is " + max_marks);
	    System.out.println("Average Marks is " + average);
	}
	
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Student st = new Student("Ayush",21,89,90,92);
		st.compute();
		st.display();
		st.accept();
		st.compute();
		st.display();
	}
}

