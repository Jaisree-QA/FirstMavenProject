public class Toostudent
{
	Toostudent(String a, String b)
	{
	a="John";
	b="Smith";
	System.out.println("To print two student details");
	}
	Toostudent(int a, int b)
	{
		System.out.println("Roll no details");
	}

public void displayMethod()
{
	System.out.println("First Student" +a+ "Second Student" +b);
}
public static void main(String args[])
{
	Toostudent obj=new Toostudent();
	obj.displayMethod();
	Toostudent obj1=new Toostudent(5,6);
	obj1.displayMethod();
	
}
}


// display method print
//2 student
//value obj create 

