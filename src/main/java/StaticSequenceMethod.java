public class StaticSequenceMethod
{
	public void add(int a,float b)
		{
		float result=a+b;
		System.out.println("Result of add = "+result);
		}
		public void add(float a,int b)
		{
		float result=a+b;
		System.out.println("Result of add = "+result);
		}
	
	public static void main(String args[])
	{
		StaticSequenceMethod obj=new StaticSequenceMethod();
	    obj.add(10,6.1f);
		obj.add(10.2f,6);
	}
}