public class PersonStatic
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
static void AddressDetails()
	{
	 int pin=45001;
	 String housename="Viagio";
	PersonDetails();
	System.out.println("housename: "+housename);
	System.out.println("pincode: "+pin);
	}
public static void main(String args[])
	{
	//classname.methodname
	PersonStatic.AddressDetails();
	}
}