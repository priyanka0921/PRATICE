class B
{
	 public void m2(B b)
		{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.m2("hii");
		b.m2(null);
		b.m2(new B());
		System.out.println("Hello World!");
	}
}

 
 /*
 if we are take user defind class as an argument then  the method will call i 2 ways :
 1) by default value (null)
 2) by creating object of the class type inn the argumeent of the method and
 here if we print rferene of the objct then it will always print the address of the object.
  
  output:null
		 B@15db9742
		 Hello World! 
  */
