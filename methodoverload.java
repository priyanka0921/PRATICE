class  methodoverload
{
	public void m1()
	{
		System.out.println("hello hunnny buny ");
	}
	public void m1(int x)
	{
		System.out.println("hello humpty bumpty ");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		methodoverload m= new methodoverload();
		m.m1();
		m.m1(10);
	}
}
/*Hello World!
hello hunnny buny
hello humpty bumpty*/