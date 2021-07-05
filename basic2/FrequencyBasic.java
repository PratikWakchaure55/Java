package basic2;

public class FrequencyBasic {
	
	int[] cal(int arr[])
	{
		
		int l = arr.length;
		
		int brr[] = new int[l];
		
		for(int i=0;i<l;i++)
		{
			
			brr[i] = -1;
			
		}
		
		
		int count = 1;
		for(int i =0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					brr[j] = 0;
				}
				
				
			}
			
			if(brr[i]!=0)
			{
				brr[i] = count;	
			}
			
			count =1;
			
		}
		
		
		for(int i=0;i<brr.length;i++)  //removal of duplicate
		{
			if(brr[i]!=0)
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		return brr;
		
	}

	public static void main(String[] args) {
		
		//
		int arr[] = {4,4,6,5,4,5,3,7,2,5,3,5,3,5,3};
		
		int zrr[]  =new FrequencyBasic().cal(arr);
		
		
		for(int i=0;i<zrr.length;i++)  //for frequency
		{
			if(zrr[i]!=0)
			{
				System.out.println(arr[i] + " " + zrr[i]);
			}
		}
		
		
	}

}
