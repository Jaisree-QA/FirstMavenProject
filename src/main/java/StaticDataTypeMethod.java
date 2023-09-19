public class StaticDataTypeMethod
{
	public void add(int a,int b)
		{
		int result=a+b;
		System.out.println("Result of add = "+result);
		}
		public void add(float a,int b)
		{
		float result=a+b;
		System.out.println("Result of add = "+result);
		}
	
	public static void main(String args[])
	{
		StaticDataTypeMethod obj=new StaticDataTypeMethod();
	    obj.add(5,6);
		obj.add(10.2f,6);
	}
}