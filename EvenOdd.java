class EvenOdd
{
	public static void main(String[] args) 
	{
	int arr[]={2,4,6,8,10};
		for (int i=2;i<=10;i++) 
		{
			if (i%2==0) 
			{
				continue;
			}
			System.out.print(i+ "The odd numbers are=");
		}
	}
}