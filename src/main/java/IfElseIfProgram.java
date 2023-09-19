public class IfElseIfProgram
{  
public static void main(String args[])
	{
 		int a=503;
	if(a<100 && a>=10)
	{
	System.out.println("Number is 2 digit");
	} 
	else if(a<999 && a>=100)
	{
	System.out.println("Number is 3 digit");
	}
	else if(a>999 && a<=10000)
	{
	System.out.println("Number is 4 digit");
	}
	else
	{
	System.out.println("Number is 0 digit");
	}
	}
}

