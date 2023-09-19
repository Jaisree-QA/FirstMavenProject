public class Student
{
	String name;
	String course;
	public Student()// No argument constructor
	{
		System.out.println("Inside no argument constructor");
		name="jaisree";
		course="java";
	}
	public Student(String n)//parameterised constructor
	{
		name=n;
		course="java";
	}
	public Student(String n,String m)//param constructor
	{
		name=n;
		course=m;
	}
	public void displayMethod()
	{
		System.out.println("Name="+name+"Course="+course);
	}

	public static void main(String args[])
	{
		Student s=new Student();
		s.displayMethod();
		Student s2=new Student("Manu");
		s2.displayMethod();
		Student s3=new Student("sona","jmeter");
		s3.displayMethod();
	}
}