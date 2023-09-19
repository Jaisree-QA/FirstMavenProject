public class CalculatorSubSum
{
static int n1=40;
static int n2;
static int result;
	public static void add()
	{
		
		n2=30;
		result=n1+n2;
		System.out.println("Sum = "+result);
	}

	public static void subtract(int n3)
	{
		result=n1-n3;
		System.out.println("Sub = "+result);
	}
	public static void main(String args[])
	{
	CalculatorSubSum.add();/*class name.methodname();*/
	CalculatorSubSum.subtract(20);
}
}