public class CalculatorDiv
{
static int n1=40;
static int n2;
static int result;
	public static int add()
	{
		
		n2=30;
		result=n1+n2;
		System.out.println("Sum = "+result);
		return result;
	}

	public static void subtract(int n3)
	{
		result=n1-n3;
		System.out.println("Sub = "+result);
	}
	public static void multipication(int n4,int n5)
	{
		result=n4*n5;
		System.out.println("Multi = "+result);
	}
	public static void div(int n6)
	{
		result=n1/n6;
		System.out.println("Div = "+result);
	}
	public static void main(String args[])
	{
	CalculatorDiv.add();/*class name.methodname();*/
	CalculatorDiv.subtract(20);
	CalculatorDiv.multipication(10,5);
	CalculatorDiv.div(3);
}
}