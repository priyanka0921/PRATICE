import java.util.Scanner;
class ReversedVpattern
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of * : ");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<2*n; j++)
			{
			if(i+j==n-1||j-i==n-1)
				{
					System.out.print("*");
				}
				else{
						System.out.print(" ");
				}
		    }
		System.out.println();
	  }
   }
}