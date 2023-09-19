public class CallInstanceVartoSM
{
	int a=5;
	int b=4;
static void add()
	{
CallInstanceVartoSM obj=new CallInstanceVartoSM();
	 int c=obj.a+obj.b;
	System.out.println("calling Instance variable inside static method");
	System.out.println("Addition: "+c);
	}	
public static void main(String args[]){
CallInstanceVartoSM.add();
}
}