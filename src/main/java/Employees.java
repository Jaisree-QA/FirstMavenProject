public class Employees
{
	 Employees()
	{
		this("jaisree");
	System.out.println("1st Employees");
	}
	 Employees(String name)
	{
		//this();// this is to invoke no argument constructor
		System.out.println("name");
	}
public static void main(String args[])
{
	Employees obj=new Employees();
}
}