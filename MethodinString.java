class B
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
/* IF we are passing a non-primitive as an argument then we call the method in 3 ways .
1) by directly passing sring value
2) by passing default value (null)
3) by creating an object of same as the class type in the arguument of the method 
	output - 
            hi
            hi
            hi
            Hello World!
*/
