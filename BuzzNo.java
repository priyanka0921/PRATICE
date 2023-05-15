import java.util.Scanner;
class BuzzNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number for prime number:");
		int n = sc.nextInt();
		
			if((n%7==0 )||(n%10==7))
			{
				 System.out.println("its a buzz number");
			}
			else{
	              System.out.println("its not a buzz number" );
			    }
			 
	}
}

 /*Enter a Number for prime number:
147
its a buzz number