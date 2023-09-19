public class CStudent
{
	int id;
	String name;
public CStudent(int i,String s)// p argument constructor
	{
		System.out.println("Details of Student");
		id=i;
		name=s;
	}
public void displayMethod()
	{
		System.out.println("ID= "+id+"name="+name);
	}
public static void main(String args[])
	{
		CStudent s=new CStudent(1,"jaisree");
		s.displayMethod();
		CStudent s2=new CStudent(2,"raki");
		s2.displayMethod();
		CStudent s3=new CStudent(3,"suru");
		s3.displayMethod();
	}
}
//public class student