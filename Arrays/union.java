package Arrays;

import java.util.HashSet;

public class union {
    public static void getUnion(int a[], int n, int b[], int m){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<n; i++){
            s.add(a[i]);
        }
        for(int i=0; i<m; i++){
            s.add(b[i]);
        }
        System.out.println("Size of the union is: "+s.size());
        System.out.println("Union: "+s.toString());
    }
    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5};
        int b[]={1, 2, 3};
        int n=a.length;
        int m=b.length;

        getUnion(a, n, b, m);
    }
}
