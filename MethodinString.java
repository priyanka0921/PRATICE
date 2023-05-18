class MethodinString
{
	public void m1(String s)
	{
		System.out.println("hi");
	} 
	
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1("hii");
		b.m1(null);
		b.m1(new String());
		System.out.println("Hello World!");
	}
} 
/* if we are give argument as string then it will print the printing statment as that provide
if we call using refrence with method name  value then it print the print statement
	output - 
            hi
            hi
            hi
            Hello World!
*/
