/*You are given a string 'S' of size 'N', consisting of only #and *. A good string is defined as a string of size 2, which is either equal to "#*" or "*#"

Return the total number of good substrings of string 'S.

A substring of string 'S' is defined as a string that can be obtained by deleting some (possibly zero) characters from the start and the end of 'S.

For Example:

Let 'N' =4, 'S'="#**#"

We have three substrings of size 2 for the 'S', which are "#*","**" and "*#".

Two of them are good. So, the total number of good substrings of 's' is 2. In java ?
import java.util.Arrays; */

public class Solution  {
    public static int stringCount(int n, String s) {
       int count=0;
     n= s.length();
    for(int i=0;i<n-1;i++)
    {
        if((s.charAt(i)=='#' && s.charAt(i+1)=='*') ||(s.charAt(i)=='*' && s.charAt(i+1)=='#'))
        {
            count++;
        }
    }
       return count ;
    }
    public static void main(String args[])
    {
        String s="#**#";
        int result=stringCount(, s);
       System.out.println(" the no of sub string :"+ result);

    }
}
//output : the no of sub string :2
