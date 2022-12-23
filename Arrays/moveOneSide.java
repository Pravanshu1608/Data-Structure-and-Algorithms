package Arrays;

public class moveOneSide {
    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void move(int arr[], int low, int high){
        while(low<=high){
            if(arr[low]<=0)
                low++;
            else
                swap(arr, low, high--);
        }
    }
    public static void main(String[] args) {
        int arr [] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n=arr.length;

        move(arr, 0, n-1);
        for(int e : arr)
            System.out.print(e+" ");
    }
}
