public class DrivingLicense
	{
	public static void main(String args[])
		{
		int i=0;
		while(i<=17)
		{
		while(i>18)
		{
		i=i+1;
			System.out.println("Eligible for driving licence");
			System.out.println(i);	
		}
		i++;
		System.out.println("Not Eligible for driving licence");		
		System.out.println(i);
		}
	}
}