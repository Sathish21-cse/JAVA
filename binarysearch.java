import java.util.*;
public class binarysearch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={3,45,67,78,90,123,456,876};
    int target =45;
    System.out.println(binary(arr,target));
  }
  static  int binary(int[] arr,int t)
  {
    int start=0;
    int end=arr.length-1;

    while(start <=end){
          int mid=(start+end)/2;

          if(arr[mid]==t)
          {
            return mid;
          }
          else if(arr[mid]>t)
          {
            end=mid-1;
          }
          else {
            start=mid+1;
          }
     }
  return -1;
  }
  
}
