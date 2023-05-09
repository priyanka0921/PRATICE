import java.util.Scanner;
class Kpattern
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
				if( i+j==n/2 || i-j==n/2 || j==0  ) 
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
} /* Enter the number of * :
14
*      *
*     *
*    *
*   *
*  *
* *
**
*
**
* *
*  *
*   *
*    *
*     *
 //  if(j==n/2 || i+j==n-1 && j>=n/2 ||i==j && j>n/2)
