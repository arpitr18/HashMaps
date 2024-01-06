package hashmaps;
import java.util.*;

// count the occurence of the given elemnt in queries with respect to arrays

// arr = 2,6,3,8,2,8,2,3,8,10,6
// queries = 2,8,3,5
public class countfrequenciyes {
    public static void main(String[] args) {

        int arr [] = {2,6,3,8,2,8,2,3,8,10,6};
        int queries [] = {2,8,3,5};

        HashMap <Integer, Integer> hm = new HashMap<>();

        for (int i =0; i< arr.length;i++){
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

        for (int i = 0;i<queries.length;i++){
            int val = queries[i];
            if (hm.containsKey(val)){
                System.out.println("The number "+val+" is repeated "+hm.get(val) + " times");
            }
            else
            {
                System.out.println("The number "+val+" is repeated "+ "0 times");
            }
        }
    }

}
