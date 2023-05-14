import java.util.Scanner;
class AletterPrint
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of * :");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n/2 || i==0 && j<=n/2 || i==n/2 && j<=n/2 ) 
				{
					System.out.print("*");
				}
					else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
/* o/p: Enter the number of * :
8
*****
*   *
*   *
*   *
*****
*   *
*   *
*   *
