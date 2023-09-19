public class SumofOdd1tohundred{
public static void main(String args[]){
	int sum=0;
	for(int i=1;i<=100;i=i+2){
	sum=sum+i;
	//System.out.println(i);
	}
	System.out.println("Total sum of odd no: "+sum);
}
}