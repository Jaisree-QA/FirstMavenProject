public class FeesStudent
{
	int rollno,age;
	String name;
	float fee;
	public FeesStudent(int roll,int ag,String nm,float feees)
	{
	rollno=roll;//this.rollno-current class variable
	age=ag;//this.ag
	name=nm;//this.nm
	fee=feees;//this.fees
	}
public void displayMethod()
{
System.out.println("rollno: "+rollno+" age: "+age+" name: "+name+" fee: "+fee);
}
public static void main(String args[])
	{
	FeesStudent obj=new FeesStudent(1,45,"john",250.25f);
	obj.displayMethod();											 
	FeesStudent obj1=new FeesStudent(1,46,"Mike",260.25f);
	obj1.displayMethod();
	FeesStudent obj2=new FeesStudent(1,47,"Dom",1350.25f);
	obj2.displayMethod();
	FeesStudent obj3=new FeesStudent(1,48,"Smith",1850.25f);
	obj3.displayMethod();
	}
}
