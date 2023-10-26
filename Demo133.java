interface Inter1
{
	void show1();
}
interface Inter2
{
	void show2();
}
interface Inter3 extends Inter1,Inter2
{
	void show3();
}
class A implements Inter3
{
public void show1()
{
	System.out.println("show1");
}
public void show2()
{
	System.out.println("show2");
}	
public void show3()
{
	System.out.println("show3");
}		
}
class Demo133
{
	public static void main(String...ar)
	{
		A a=new A();
		a.show1();
		a.show2();
		a.show3();
	}
}