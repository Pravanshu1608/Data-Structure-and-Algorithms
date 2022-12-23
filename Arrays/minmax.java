package Arrays;

public class minmax {
    static void getMinMax(int arr[]){
        int min=arr[0], max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        getMinMax(arr);
    }
}
