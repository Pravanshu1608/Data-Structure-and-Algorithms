package Arrays;

/*
Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
Your Task:
You don't need to read input or print anything. Your task is to complete the function inversionCount() which takes the array arr[] and the size of the array as inputs and returns the inversion count of the given array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018

 */

public class countInversion {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long count=0;
    public static long[] conquer(long left[], long right[]){
        long merged[]= new long[left.length+right.length];
        
        int idx1=0;
        int idx2=0;
        int x=0;
        while(idx1<left.length && idx2<right.length){
            if(left[idx1]<=right[idx2]){
                merged[x++]=left[idx1++];
            } else{
                count+=left.length-idx1;
                merged[x++]=right[idx2++];
            }
        }
        while(idx1<left.length){
            merged[x++]=left[idx1++];
        }
        while(idx2<right.length){
            merged[x++]=right[idx2++];
        }
        return merged;
    }
    public static long[] divide(long arr[], int sidx, int eidx){
        if(sidx==eidx){
            long baseArray[] = new long[1];
            baseArray[0]=arr[sidx];
            return baseArray;
        }
        int mid = sidx + (eidx-sidx) /2;
        long left[]=divide(arr, sidx, mid);
        long right[]=divide(arr, mid+1, eidx);
        long merged[]=conquer(left, right);
        
        return merged;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        count=0;
        divide(arr, 0, (int)N-1);
        return count;
    }
    
}
