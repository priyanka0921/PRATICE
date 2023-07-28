package Prink;

public class AutomorphicNumber {

	public static void main(String[] args) 
	{
		int n=25;
		System.out.println(isAutomorphic1(n));

	}
	public static boolean isAutomorphic1(int n)
	{
		int copy=n;
		int sq=n*n;
		int i=1;
		while(n!=0)
		{
			n /= 10;
			i=i*10;
		}
		if((sq % i)==copy)
			return true;
		return false;
	}
	public static boolean isAutomorphic2(int n)
	{
		int sq=n*n;
		while(n!=0)
		{
			if(n%10==sq%10)
			{
				n/=10;
				sq /=10;
				}else
					return false;
			}
		return true;
	}


}
