package Arrays;

public class reverseArray {
    static void revArray(int arr[], int start, int end){
        if(start>=end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        revArray(arr, start+1, end-1);
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[]={4, 5, 3, 1, 2};

        printArray(arr);
        revArray(arr, 0, arr.length-1);
        System.out.println("Reversed array is");
        printArray(arr);
    }
}
