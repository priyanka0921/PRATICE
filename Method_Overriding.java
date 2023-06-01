
class P
{
  public Object m1(int x)
	{
		System.out.println(" helllooo you need anything :");
				return "priyanka";
	}
}
class z extends P
{
 public String m1(int x)
	{
		System.out.println(" helllooo you need anything :");
				return null;
	}
}
class p1 
{
	public static void main(String[] args) 
	{
		P b= new P();
		b.m1(100);
		System.out.println("Hello World!");
	}
}
