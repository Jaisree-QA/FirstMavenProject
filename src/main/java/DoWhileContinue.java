public class DoWhileContinue
{
	public static void main(String args[])
	{
	int i=0;
	do{
		if(i==7)
		{
			i++;
			continue;
		}
		System.out.println(i);
		i++;
	}while(i<=10);
	}
}

/*initialization
do
{
statement;
increment/decrement;
}
while(condition);

*/