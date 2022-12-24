package Arrays;

public class rotateby1 {
    public static void rotate(int arr[], int n){
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    
    public static void reversal(int arr[], int low, int high){
        while(low<high){
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void rotatebyd(int arr[], int n, int d){
        reversal(arr, 0, d-1);
        reversal(arr, d, n-1);
        reversal(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n=arr.length;

        //rotate(arr, n);
        rotatebyd(arr, n, 1);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
