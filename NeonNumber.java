class NeonNumber
{
  public static void main(String[] args) 
	{
        int x=9;
		int sqr=x*x;
        int rem,sum=0;
		while(sqr>0)
		{
			rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
        if(x==sum)
		{
		System.out.println("awwwww its a neon number");
		}
		else
		{
			System.out.println("its not a neon number");
		}
	}
}
/* logic : if the number square , is equal to The sum of each Number of the square same as the Number.
ex: if the number is :9 
  9*9=81
  8+1=9 */
