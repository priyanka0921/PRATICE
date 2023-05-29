class method_overload 
{
	public void m1(float y)
    {
		System.out.println("hello");
    }
	public void m1(double x)
	{
		System.out.println("Bye");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	method_overload	m= new method_overload();
	m.m1(100);
m.m1(10.00);
	}
}
