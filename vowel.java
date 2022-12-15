# lab

public class Vowel {

	public static void main(String[] args) {
	
		String str="abcdefghijklmnopqrstuvwxyz";
		char[] a=str.toCharArray();
		
	int count=0;int consonantcount = 0;
	for(int i=0;i<str.length();i++)
	{
		if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
		{
			count++;
		}else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
		{
			consonantcount++;
		}
	

	}
	 System.out.println(count );
	 System.out.println(consonantcount  );
		

	}

}
