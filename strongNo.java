class strongNo 
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num ;// 145 = 1+4!+5!= 145
		
		int sum=0;
					
	  while ( num!=0)
		{ 
			int rem= num%10;
			int fact=1;
			int i=1;
		while(i<=rem)
		//for(int i=1; i<=rem;i++) 
		{
				fact=fact*i;
				i++;
	    }
		
		 sum= sum+ fact;
		 num=num/10;

		}
		
		if(sum==temp)
		{   
		System.out.println( " StrongNo of a number ."  );
		}
		else{
			System.out.println( " Not a StrongNo number  ");
		}
	  }
		
}
