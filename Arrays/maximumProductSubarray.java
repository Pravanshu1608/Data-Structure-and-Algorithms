package Arrays;

/* Maximum Product Subarray
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
Note: Use 64-bit integer data type to avoid overflow.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 500
-102 ≤ Arri ≤ 102

 */

public class maximumProductSubarray {
    long maxProduct(int[] arr, int n) {
        // code here
        long max=arr[0];
        long min=arr[0];
        long result=arr[0];
        if(n==1){
            return result;
        }
        for(int i=1; i<n; i++){
            if(arr[i]==0){
                max=1;
                min=1;
                continue;
            }
            long temp1=arr[i]*max;
            long temp2=arr[i]*min;
            max=Math.max(temp1, temp2);
            max=Math.max(max, arr[i]);
            min=Math.min(temp1, temp2);
            min=Math.min(min, arr[i]);
            result=Math.max(result, max);
        }
        return result;
    }
    
}
