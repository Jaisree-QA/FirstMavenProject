public class PersonStaticstaticmethodintoainstancemethod
{
	static String name="ashok";
	static String place="Poovar";
	static int age=45;
static void PersonDetails()
	{
	System.out.println("Owner: "+name);
	System.out.println("place: "+place);
	System.out.println("Age: "+age);
	}
void AddressDetails()
	{
	 int pin=45001;
	 String housename="Viagio";
	PersonStaticstaticmethodintoainstancemethod.PersonDetails();//class name.method name static call
	System.out.println("housename: "+housename);
	System.out.println("pincode: "+pin);
	}
public static void main(String args[])
	{
	PersonStaticstaticmethodintoainstancemethod obj= new PersonStaticstaticmethodintoainstancemethod();//syntax instance call
	obj.AddressDetails();//instance call
	}
}