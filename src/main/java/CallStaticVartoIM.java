public class CallStaticVartoIM
{
	static int a=5;
	static int b=4;
 void subtraction()
	{
	int c=a-b;
	System.out.println("calling static variable inside Instance method");
	System.out.println("subtraction: "+c);
	}	
public static void main(String args[])
{
CallStaticVartoIM obj=new CallStaticVartoIM();
obj.subtraction();
}
}