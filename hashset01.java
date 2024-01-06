package hashmaps;
import java.util.*;
/* find the no if distinct elements in the fiven arrays
int [] arr = {10,10,10,20,20,30}; */
public class hashset01 {
    public static void main(String[] args) {
        int [] arr = {10,10,10,20,20,30};
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i<n; i++)
        {
            hs.add(arr[i]);
        }
        System.out.println("The number of distinct elements in the given array is "+hs.size());

    }
}
