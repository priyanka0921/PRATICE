import java.util.Scanner;
class  StarPattern // the order wise of numbers 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of * : ");
		int n = sc.nextInt();
		int a=1;
		for(int i =0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
			if(i>=j)
				{
					System.out.print(a++ + " ");
				}
		    }
		System.out.println();
	  }
   }
}
