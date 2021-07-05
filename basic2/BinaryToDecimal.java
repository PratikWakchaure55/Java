package basic2;



public class BinaryToDecimal {

	
	void deci(int arr[],int n)
	{
		
		int base =1 ;
		int sum =0;
		
		for(int i= n-1;i>=0;i--)
		{
			
			sum =sum + arr[i]*base;
			base*=2;
			
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
	

		BinaryToDecimal b = new BinaryToDecimal();
		
		int arr[] = {0,1,1};
		int n = arr.length;

	
		b.deci(arr,n);
		
	}

}
