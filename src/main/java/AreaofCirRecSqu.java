public class AreaofCirRecSqu
{
	public void Area()
	{
	float l=5.2f,w=10.5f,result;
	result=l*w;
	System.out.println("Area of Rectangle= "+result);
	}
	public void Area(float p,float r)
	{
	float result=p*r*r;
	System.out.println("Area of Circle= "+result);
	}
	public void Area(int a,int b)
	{
	int result=a*b;
	System.out.println("Area of Square= "+result);
	}
public static void main(String args[])
	{
		AreaofCirRecSqu obj=new AreaofCirRecSqu();
		obj.Area();
		obj.Area(3.14f,2.5f);
		obj.Area(5,5);
	}
}