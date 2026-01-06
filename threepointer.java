import java.util.*;
public class threepointer {
  public static void main(String[] args) {
    int[] arr={1,0,2,1,0,1,2};
    int i=0,j=0,k=arr.length-1,temp=0;
    while(j<arr.length && j<=k)
    {
         if(arr[j]==0)
         {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
         i++;
         }
         else if(arr[j]==2)
         {
          arr[j]=arr[k];
          arr[k]=2;
          k--;
         } 
         else 
         {
          j++;
         }
    }
    System.out.println(Arrays.toString(arr));
  }
  
}
