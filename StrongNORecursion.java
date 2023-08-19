package recursionPrograms;

public class StrongNoRecursion {
	public static int strong(int n)
	{
		if(n==0)
			return 0;
		return fact(n%10) + strong(n/10);
	}
	public static int fact(int i) {
		int n = 0;
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		return n *fact(n-1);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
		int num=n;
		int strong1=strong(n);
		if(strong1 == num)
		System.out.println("strong number");
		else
			System.out.println("not a strong number");

	}

}
