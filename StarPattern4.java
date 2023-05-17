
import java.util.Scanner;
class StarPattern4
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
				if(i==0 || i==n/2 || i==n-1 || i+j==n-1|| j==0 || j==n/2 || j==n-1 || i==j) 
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

/* output - 
      Enter the number of * : 15
                              
***************
**     *     **
* *    *    * *
*  *   *   *  *
*   *  *  *   *
*    * * *    *
*     ***     *
***************
*     ***     *
*    * * *    *
*   *  *  *   *
*  *   *   *  *
* *    *    * *
**     *     **
***************      */