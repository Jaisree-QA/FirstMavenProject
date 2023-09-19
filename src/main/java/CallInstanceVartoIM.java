public class CallInstanceVartoIM
{
	int a=5;
	int b=4;
 void add()
	{
CallInstanceVartoIM obj=new CallInstanceVartoIM();
	 int c=obj.a+obj.b;
	System.out.println("calling Instance variable inside static method");
	System.out.println("Addition: "+c);
	}	
public static void main(String args[]){
CallInstanceVartoIM obj=new CallInstanceVartoIM();
obj.add();
}
}