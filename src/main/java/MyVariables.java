public class MyVariables
{
	public static void main(String args[])
	{
	int a=20;
	int b=3;
	int c=(a++ + ++a);//21+21=42
	int d=(a++ + b++);//21+4=25
	int e=(a++ + ++b);//20+4=28
	int f=(a-- + --b);//20-2=28
	int pre=++a;
	int pos=a++;
	System.out.println("calc of c ="+c);
	System.out.println("calc of d ="+d);
	System.out.println("calc of e ="+e);
	System.out.println("calc of f ="+f);
	}

}

