import java.util.Scanner;
public class NumberofChar {

	public static void main(String[] args) {
		 Scanner ss= new Scanner(System.in);
		 System.out.println("Enter a string");
		 String str=ss.nextLine();
		 char[] a=str.toCharArray();//convert 
		 int count=0;
		 for(int i=1;i<=str.length();i++)
		 {
			 count++;
		 }
		 
		 System.out.println("tottal number of char is"+ " "+count);

	}

}
/*Enter a string
priyanka dash
tottal number of char is 13 */