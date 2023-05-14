

import java.util.Scanner;
class digitofLastno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		int rem= n%10 ;
	     System.out.println("its a last number of a digit " + rem);
	}
}


