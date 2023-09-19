public class Calculator
{
static int n1;
static int n2;
static int result;
	public static void add()
	{
		n1=20;
		n2=30;
		result=n1+n2;
		System.out.println("Sum = "+result);
	}
	public static void main(String args[])
	{
	Calculator.add();/*class name.methodname();*/
	}
}