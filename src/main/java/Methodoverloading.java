public class Methodoverloading
{
	public void add()
		{
		int a=5,b=10,result;
		result=a+b;
		System.out.println("Result ="+result);
		}
		public void add(int a,float b)	
		{
		//int result;
		float result=a+b;
		System.out.println("Result ="+result);
		}
		public void add(int a,int b,int c)	
		{
		//int result;
		int result=a+b+c;
		System.out.println("Result ="+result);
		}
		public void add(int a,float b,int c)	
		{
		float result=a+b+c;
		System.out.println("Result ="+result);
		}
		public void add(float a,float b)	
		{
		float result=a+b;
		System.out.println("Result ="+result);
		}
	public static void main(String args[])
	{
	Methodoverloading obj1=new Methodoverloading();
	obj1.add();
	obj1.add(2,3.5f);
	obj1.add(2,3,4);
	obj1.add(2,10.5f,4);
	obj1.add(10.2f,3.5f);
	}
}