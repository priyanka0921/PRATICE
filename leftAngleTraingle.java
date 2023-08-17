package pattern;

public class leftAngleTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int stars=1;
		int spaces=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			    spaces--;
				stars++;
				System.out.println();
				
		}
   System.out.println("--------------");
   for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
			System.out.print(" ");
		for(int j=1;j<=spaces;j++)
			System.out.print("*");
			System.out.println();
		}
	}
}

//output 
/*		*
		**
		***
		****
		*****    */
