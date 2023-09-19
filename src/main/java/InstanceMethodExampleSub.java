public class InstanceMethodExampleSub
{
int x,y,z;
	public void sub()// calling a Nonstatic method to Static method
	{
	x=10;
	y=5;
	z=x-y;
	System.out.println(z);
	}
public int multi()
	{
	z=x*y;
	//return z;
	System.out.println(z);
	return z;
	}
	public static void main(String args[])
	{
	// className objectname=new ClassName();
	InstanceMethodExampleSub obj=new InstanceMethodExampleSub();
	obj.sub();
	obj.multi();
	}
}