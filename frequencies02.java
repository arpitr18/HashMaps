package hashmaps;
import java.util.*;
/*
Find the first non-repeating element in the given array
int arr[] = {5,4,4,3,6,7,5,6};
*/
public class frequencies02 {
    public static void main(String[] args) {
        int [] arr = {5,4,4,3,6,7,5,6};
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0;i<n;i++){
            if (hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                temp +=1;
                hm.put(arr[i],temp );
            }
            else
            {
                hm.put(arr[i],1 );
            }
        }

        for (int i = 0; i<n;i++){
            if (hm.get(arr[i]) == 1){
                System.out.println("The first non-repeating element is " + arr[i]);
                break;
            }
        }
    }
}
// time complexity is O(2n) that is equal to O(n) neglecting the constants


