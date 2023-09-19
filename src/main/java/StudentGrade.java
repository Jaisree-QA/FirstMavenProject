public class StudentGrade
{
	String subject;
	int mark;
	public StudentGrade(String a,int b)
	{
	subject=a;
	mark=b;
	}
public void displaymethod()
{
	//String result=b+b;
	System.out.println("Subject= "+subject+"Mark= "+mark);
	if(mark>90)
			{
			System.out.println("Grade = A");
			}
			else{
			System.out.println("Grade = B");
			}

		}
public static void main(String args[])
{
			
	StudentGrade obj=new StudentGrade("Maths ",85);
	obj.displaymethod();
	StudentGrade obj2=new StudentGrade("Science ",95);
	obj2.displaymethod();
}
}