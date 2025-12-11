import java.util.*;
public class binarysearch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={896,256,96,81,45,75,50,12,4};
    int target =45;
    if(arr[0]<arr[arr.length-1])
        System.out.println(assbinary(arr,target));
    else
      System.out.println(dessbinary(arr,target));

  }
  static  int assbinary(int[] arr,int t)
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

  static int dessbinary(int[] arr,int t)
  {
    int start=0;
    int end=arr.length-1;

    while(start <=end){
          int mid=(start+end)/2;

          if(arr[mid]==t)
          {
            return mid;
          }
          else if(arr[mid]<t)
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
