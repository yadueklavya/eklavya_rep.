class demo
{
	public static void main(String ar[])
	{
		
		int x[]={10,20,30,40,50};
		int y[]=new int [5];
		
		for(int j:x)
		{
			y[j]=x[j];
		}
		
		y[2]=555;
		
		System.out.print("Array x=");
		int i;
		for(int i:y)
		{
			System.out.print("\n Array y=");
			for(int i:y);
			{
				System.out.print(i+" ");
			}
		}
}   }