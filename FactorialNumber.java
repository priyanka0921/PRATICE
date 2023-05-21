import java.util.Scanner;
class FactorialNumber
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of * : ");
		int n = sc.nextInt();
		 int fact=1;
		
		for(int i =1; i<=n; i++)
		{
				fact=fact*i;
					
	    }
		System.out.println( "fact of a number is :" + fact);
	  }
   }
/*Enter the number of * :
5
fact of a number is :120