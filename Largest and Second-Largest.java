import java.util.*;

public class SecondLargest {
  
    public static void main(String[] args) {
      int arr[]={1,3,2,5,7,4};
      int largest=arr[0]; int sec_large=-1;
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i]>largest )
        {
          sec_large=largest;
          largest=arr[i];
          
        }else if(arr[i]<largest&&arr[i]>sec_large)
       sec_large=arr[i];
      }
       System.out.println(largest);
     System.out.println(sec_large);
  }
}

//output :  7 5
import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      int arr[]={1,3,2,5,7,4};
      int largest=arr[0]; 
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i]>largest )
        {
          largest=arr[i];
          
        }
       
      }
       System.out.print(largest);//output : 7
     // System.out.println();
  }
}






