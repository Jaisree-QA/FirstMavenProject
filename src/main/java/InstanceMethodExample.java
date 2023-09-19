public class InstanceMethodExample
{
int x,y,z;
	public void add()// calling a Nonstatic method to Static method
	{
	x=5;
	y=10;
	z=x+y;
	System.out.println(z);
	}

	public static void main(String args[])
	{
	// className objectname=new ClassName();
	InstanceMethodExample obj=new InstanceMethodExample();
	obj.add();/*non static method can be call inside static method using object*/
	System.out.println(obj.a);
	}
public void add1(int x,int y)// calling a Nonstatic method to Static method
	{
	int e=x+y;
	System.out.println("sum is = "+e);
	obj.add1(5,5);
	}
public void callothers()
{
System.out.println("calling all method");
obj.add1(11,12);
obj.add();
obj.callothers();
}

}