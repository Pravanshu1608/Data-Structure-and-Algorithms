package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class unique {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num_occur= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            num_occur.put(arr[i], num_occur.getOrDefault(arr[i], 0)+1);
        }
        HashSet<Integer> set= new HashSet<>(num_occur.values());
        return num_occur.size()==set.size();
        
    }
    
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 1, 1, 3};
        int n=arr.length;

        System.out.println(uniqueOccurrences(arr));
    }
}
