
// its print a number of digit 

import java.util.Scanner;
class NumberofDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		 int count =0;
		 while(n>0)
		{
	       n=n/10 ;
		count++;
		}
	     System.out.println("its a  number of a digit " + count);
	}
}

/*Enter a Number :
147
its a  number of a digit 3