class test1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
		b.m2();
	}
}
class A
{
	public void m1()
	{
		System.out.println("this is world f java");
	}
}
class B
{
	public void m2()
	{
		System.out.println(" java contained object-oriented things");
	}
}
/*output - Hello World!
this is world f java
this is world f java
 java contained object-oriented things */
