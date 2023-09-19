public class SumOfArray 
{  
    public static void main(String[] args) 
	{   
	int arr1[][] = {{1, 2},{4, 5}};
	int arr2[][] = {{1, 2},{4, 5}};
    int sum[][] = new int [2][2]; 
        for (int i=0;i<2;i++) 
		{  
			for (int j=0;j<2;j++) 
			{
           sum[i][j] = arr1[i][j] + arr2[i][j];  
		   System.out.print(" "+sum[i][j]);
			}
        System.out.println();    
		}
} 
}  