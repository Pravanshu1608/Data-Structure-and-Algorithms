/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 */

package Arrays;

public class maxSubArraySum {
public static long getMaxSubArraySum(int arr[], int n){
    int sum=0;
    int max=arr[0];
    for(int i=0; i<n; i++){
        sum+=arr[i];
        max=Math.max(max,sum);
        if(sum<0)
            sum=0;
    }
    return max;
}
    public static void main(String[] args) {
        int arr[]={5, 4, -1, 7, 8};
        int n=arr.length;
        
        System.out.println(getMaxSubArraySum(arr, n));
    }
}
