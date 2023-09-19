public class LargestofThreeNo
{
	public static void main(String args[])
	{
	int a=40;
	int b=41;
	int c=40;
		if(a>b && a>c)
			{
			System.out.println("a is largest");
			}
		else if(b>a && b>c)
			{
			System.out.println("b is largest");
			}
		else if(c>b && c>a)
			{
			System.out.println("c is largest");
			}
		else{
			System.out.println("Invalid");
			}
	}
}