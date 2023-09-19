public class NoArgParaCons
{
	String name;
	int age;
	String course;
	String degree;											  
	public NoArgParaCons()
	{
	System.out.println("Details of student");
	name="dominic";
	age=45;
	}
	public NoArgParaCons(String a,String b)
	{
	 course=a;
	 degree=b;
	}
public void displayMethod()
{
System.out.println("Name: "+name+"Age: "+age);
System.out.println("Course: "+course+"Degree: "+degree);
}
public static void main(String args[])
	{
	NoArgParaCons obj=new NoArgParaCons();
	obj.displayMethod();											 
	NoArgParaCons obj1=new NoArgParaCons("java","BE");
	obj1.displayMethod();
	}
}