import java.util.Scanner;
class Epattern
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
				if(j==0 || i==0 || i==n-1 || i==n/2 && j<=n/2) 
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
/* output : Enter the number of * :
14
**************
*
*
*
*
*
*
********
*
*
*
*
*
************** 
