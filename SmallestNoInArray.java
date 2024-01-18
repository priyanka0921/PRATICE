public class SmallestNoInArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,8,2,3};
        int smallest=arr[0];
        int sec_smallest= Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
          if(arr[i]<smallest)
          {
            sec_smallest=smallest;
            smallest=arr[i];
          }else if(arr[i]!=smallest && arr[i]<sec_smallest){
            sec_smallest=arr[i];
          }
        } 
        System.out.println(sec_smallest);
        System.out.println(smallest);
    }  
}
