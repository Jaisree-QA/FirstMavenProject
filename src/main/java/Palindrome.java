public class Palindrome 
	{

public static void main (String args[])
	{
		String pali="ola";
		boolean flag=true;
		
			System.out.println(pali.length());
		for(int i=0;i<pali.length()/2;i++)
		{
		if(pali.charAt(i)!=pali.charAt(pali.length()-i-1))
		{
		flag=false;
		break;
		}
		}
	
	if(flag)
	{
	System.out.println("palindrome");
	}
	else
	{
	System.out.println("Not a palindrome");
	}

	}
}
