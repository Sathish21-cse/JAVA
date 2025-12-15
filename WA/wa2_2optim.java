package WA;
import java.util.*;
public class wa2_2optim {
  public static void main(String[] args) {
    int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = {FirstLastPosition(arr, target, true),FirstLastPosition(arr, target, false)};
        System.out.println(Arrays.toString(ans));

  }

   public static int FirstLastPosition(int[] arr, int target, boolean isFirst) {
        int s = 0, e = arr.length - 1, ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    e = mid - 1; 
                } else {
                    s = mid + 1; 
                }
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

  
}
