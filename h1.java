class Employee
{
	int id;
	String add;
	Employee(int id,String add)
	{
		this.id=id;
		this.add=add;
	}
}
class Employee1
{
	
public static void main(String ar[])
{
	Employee e1=new Employee(101,"aaa");
	Employee e2=new Employee(101,"aaa");
	Employee e3=new Employee(102,"bbb");
	Employee e4=e1;
	System.out.println(e1==e2);
	System.out.println(e1==e3);
	System.out.println(e1==e4);
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1.equals(e4));
	System.out.println(e1.equals("aaa"));
	System.out.println(e1.equals(101));
}
}


	