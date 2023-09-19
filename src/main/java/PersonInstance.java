public class PersonInstance
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
 void AddressDetails()
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
	PersonInstance obj= new PersonInstance();
	obj.AddressDetails();
	}
}