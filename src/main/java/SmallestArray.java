public class LargestArray
{
	public static void main(String args[])
		{
		int nums[]={30,40,50,60,90,20};
		int largest=findLargestNumber(nums);
		System.out.println("The Largest no is "+largest);
		}
		public static int findLargestNumber(int nums[])
		{
			int largest=nums[0];
			for(int i=1;i<nums.length;i++)
			{
					if(nums[i]<largest)
					{
						largest=nums[i];
					}
			}
			return largest;
		
}
}