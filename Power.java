package recursionPrograms;

public class Power {
	public static int pow(int base,int exp)
	{
		if(exp==0)
		 return 1;
		return base*pow(base,exp-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(pow(5,2));
	}

}
