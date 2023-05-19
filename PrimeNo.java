import java.util.Scanner;
class primeNo
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number for prime number:");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
			System.out.println("its a  prime number.");
		else
			System.out.println("its a non-prime number");
	}
}
/* ouput : Enter a Number for prime number:
			97
			its a  prime number.
			99
			its a non-prime number
 */
