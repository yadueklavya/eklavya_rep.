class bf
{
	public static void main(String ar[])
	{
		StringBuffer s1=new StringBuffer("ram");
		StringBuffer s2=new StringBuffer("ram");
		StringBuffer s3=new StringBuffer("ramji");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
		