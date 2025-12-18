package WA;
import java.util.*;
public class wa2_2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] ans = {-1, -1};
        int target = 8;
        int s = 0, e = arr.length - 1;

        while (s < arr.length && arr[s] != target) {
            s++;
        }
        if (s < arr.length) ans[0] = s;  

        while (e >= 0 && arr[e] != target) {
            e--;
        }
        if (e >= 0) ans[1] = e;  
        System.out.println(Arrays.toString(ans));
    }
}