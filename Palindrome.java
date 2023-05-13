class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=121; // its show that the number is same as its reverse 
		int n= num;
		int rev=0;
   while(num>0)
		{
			int rem= num%10;
			rev= (rev*10)+rem;
			num= num/10;
		}
		if(n==rev)
			{
				System.out.println(" pallindrome");
			}else{
				System.out.println(" not a palindrome");
			}
	}
}
/* output- 121
