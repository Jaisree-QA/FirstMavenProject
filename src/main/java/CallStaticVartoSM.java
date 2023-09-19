public class CallStaticVartoSM
{
	static int a=5;
	static int b=4;
static void add()
	{
	int c=a+b;
	System.out.println("calling static variable inside static method");
	System.out.println("Addition: "+c);
	}	
public static void main(String args[])
{
CallStaticVartoSM.add();
}
}