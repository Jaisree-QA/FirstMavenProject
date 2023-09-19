public class blocks
{
	public displayblocks()
	{
	System.out.println("First block");//this can be used to invoke current class method
	}
	public displayblocks()
	System.out.println("second block");
	displayblocks();
	public static void main(String args[])
	{
	blocks obj=new blocks();
	obj.displayblocks();
	}
}