public class whilebreak
{
	public static void main(String args[])
	{
		int i=0;
		while(i<=50)
	{
			if(i==10)
			{
			break;
			}System.out.println(i);
			i++;
	}
	System.out.println("outside loop");
}
}