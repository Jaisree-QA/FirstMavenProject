public class Test
{

int a;// instance variable
static int b;//static variable
static Integer c;// non primitive
	public static void main(String args[])
		{
		//System.out.println(a); /*we cannot call non static variable inside static method*/
		System.out.println(b);/* primitive has a default value always*/
		System.out.println(c); /* non primitive has a null value*/
// className objectname=new ClassName();
	Test obj=new Test();
	obj.a=5;
	System.out.println(obj.a);
	int d=10;
	System.out.println(d);
	/*int d=20;// cannot define twice
	System.out.println(d);*/
	//static int e; static variable cannot define inside method
	}
	}
	
/*Static varible can call in to the static method
Non Static variable can call inside static method */
		
