class ThreadDemo
{
	public static void main(String ar[])
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main  Thread");
		}
	}
}