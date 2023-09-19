public class WeeksbySwitch
{
static int i=7;
		public static int week()
		{
		switch(i)
		{
		case 1:
		System.out.println("Sunday");
		break;
		case 2:
		System.out.println("Monday");
		break;
		case 3:
		System.out.println("Tuesday");
		break;
		case 4:
		System.out.println("Wednesday");
		break;
		case 5:
		System.out.println("Thursday");
		break;
		case 6:
		System.out.println("Friday");
		break;
		case 7:
		System.out.println("Saturday");
		break;	
		default:
		System.out.println("Invalid");
		break;
		}
		return i;
		}
		public static void main(String args[])
		{
		WeeksbySwitch.week();
		}
	}
