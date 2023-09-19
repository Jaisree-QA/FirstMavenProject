public class AverageOM
{
	public void avg()
		{
		int a=50;
		int b=10;
		int c=20;
		int result=(a+b+c)/3;
		System.out.println("Average of 3 digit = "+result);
		}
	public void avg(float a,float b,float c)
		{
		float result=(a+b+c)/3;
		System.out.println("Average of 3 digit = "+result);
		}
public static void main(String args[])
	{
		AverageOM obj1=new AverageOM();
		obj1.avg();
		obj1.avg(0.5f,0.5f,0.5f);
	}
}