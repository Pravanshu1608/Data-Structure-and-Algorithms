package Arrays;

import java.util.HashSet;

public class intersection {
    public static void getIntersection(int arr1[], int arr2[]){
        HashSet<Integer> set1 = new HashSet<>();
        for(int e : arr1)
            set1.add(e);
        for(int e : arr2){
            if(set1.contains(e))
                System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9, 11};
        int arr2[] = {4, 6, 8, 9, 12};

        getIntersection(arr1, arr2);
    }
}
