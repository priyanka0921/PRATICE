class Armstrong
{
	public static void main(String[] args) 
	{
		int num=153;
		int n= num;
		int arm =0;
		while(num>0)
		{
			int rem= num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;

		}
		if(arm==n)
		{
		System.out.println("its a armstrong number :" + n);
		} else {
			System.out.println("not a armstrong ");
		}
	}
}
