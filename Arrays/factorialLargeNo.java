package Arrays;

/* Factorials of large numbers
Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

Your Task:
You don't need to read input or print anything. Complete the function factorial() that takes integer N as input parameter and returns a list of integers denoting the digits that make up the factorial of N.


Expected Time Complexity : O(N2)
Expected Auxilliary Space : O(1)

 */

public class factorialLargeNo {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> arr = new ArrayList();
        int size=1, carry=0;
        arr.add(0, 1);
        int val=2;
        while(val<= N){
            for(int i=size-1; i>=0; i--){
                int temp = arr.get(i)*val + carry;
                arr.set(i, temp%10);
                carry=temp/10;
            }
            while(carry!=0){
                arr.add(0, carry%10);
                carry=carry/10;
                size++;
            }
            val++;
        }
        return arr;
    }
}
