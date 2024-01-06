package hashmaps;
import java.util.*;
/* Given arr[n], check if there exists a pair(i,j)
such that arr[i] + arr[i] == k and (i!=j)
int arr[] = {8,9,1,-2,4,5,11,-6,7,5}*/
public class pairsumk {
    public static void main(String[] args) {
        int arr[] = {8,9,1,-2,4,5,11,-8,7,5};
        System.out.println(pairsum(arr,-4));
    }
    public static boolean pairsum(int [] arr , int k){
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

        for (int i = 0;i<n;i++){
            int a = arr[i];
            int b = k-a;
            if ((a!=b) && (hm.containsKey(b) == true))
            {
                return true;
            }
            else if ((a==b) && (hm.containsKey(b)==true) && (hm.get(b)>1))
            {
                return true;
            }
        }
        return false;
    }

}
