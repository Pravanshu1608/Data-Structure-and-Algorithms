package Arrays;

public class sort {
    /*public static void sort012(int arr[], int n){
        int a1=0, a2=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0)
                a1++;
            if(arr[i]==1)
                a2++;
        }
        for(int i=0; i<a1; i++){
            arr[i]=0;
        }
        for(int i=a1; i<a1+a2; i++){
            arr[i]=1;
        }
        for(int i=a1+a2; i<n; i++){
            arr[i]=2;
        } 
    } */
    public static void DNFSort(int arr[], int low, int mid, int high){
        while(mid<=high){
            switch(arr[mid]){
                case 0 : {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(arr, mid, high);
                    high--;
                    break;
                }
            }
        }
    }
    
    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0};
        int n=arr.length;

        //sort012(arr, n);
        DNFSort(arr, 0, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
