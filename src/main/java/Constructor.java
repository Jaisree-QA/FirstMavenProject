public class Constructor
{
	String name;
	String course;
	public Student()// No argument constructor
	{
		System.out.println("Inside no argument constructor");
		name=jaisree;
		course=java;
	}
	public void displayMethod()//param constructor
	{
		System.out.println("Name="+name+"Course="+course);
	}

	public static void main(String args[])
	{
		Constructor s=new Constructors();
		s.displayMethod();
	}
}