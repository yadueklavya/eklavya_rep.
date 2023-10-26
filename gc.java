class A 
{
	void show()
	{
		System.out.println("ram");
		A a1=new A();
		A a2=new A();
		A a3=new A();
		return a3;
	}
}
class gc
{
	public static void main(String ar[])
	{
		A a =new A ();
		A a5=a.show();
		System.out.println("ramji");
	}
}
