public class PersonInstanceMethodtoStaticMethod
{
	 String name="ashok";
	 String place="Poovar";
	 int age=45;
void PersonDetails()
	{
	System.out.println("Owner: "+name);
	System.out.println("place: "+place);
	System.out.println("Age: "+age);
	}
static void AddressDetails()
	{
	 int pin=45001;
	 String housename="Viagio";
		PersonInstanceMethodtoStaticMethod obj= new PersonInstanceMethodtoStaticMethod();
		obj.PersonDetails();
	System.out.println("housename: "+housename);
	System.out.println("pincode: "+pin);
	}
public static void main(String args[])
	{
	//classname.methodname
	//PersonInstanceMethodtoStaticMethod obj= new PersonInstanceMethodtoStaticMethod();
	PersonInstanceMethodtoStaticMethod.AddressDetails();
	//AddressDetails();
	
	}
}