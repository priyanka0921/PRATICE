import java.util.Scanner;
class primeNumberUserInput
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number for prime number:");
		int n = sc.nextInt();
		int primenumbers=0;
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
		  	{
			  	if(i%j==0)
				   {
				    	count++;
				   }
		 	  }
				if(count==2)
				{ 
		         // primenumbers= primenumbers + i;
					System.out.println("its a  prime number " +i);
				}
      }
	}
}

/*Enter a Number for prime number:
30
its a  prime number 2
its a  prime number 3
its a  prime number 5
its a  prime number 7
its a  prime number 11
its a  prime number 13
its a  prime number 17
its a  prime number 19
its a  prime number 23
its a  prime number 29 */
