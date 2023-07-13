/*
You are given an integer array 'A' of size 'N', sorted in ascending order. You are also given an integer 'target'.


Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. Otherwise, return -1.


Note: You must write an algorithm whose time complexity is O(logN).


Example:


Input: ‘N’ = 7 ‘target’ = 3
‘A’ = [1, 3, 7, 9, 11, 12, 45]

Output: 1

Explanation: For A = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of 'target' to be searched for in the array/list.
Output Format :
Return the index at which 'target' is present for each test case, -1 otherwise.
Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1
Explanation of sample output 1:
For nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.


Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1
Explanation of sample output 2:
For nums = [1, 2, 3, 4, 5, 6, 7],
Element '9' doesn't exist.
Hence, the answer is '-1'.


Constraints :
1 <= N <= 10^4
1 <= A[i] <= 10^9
1 <= target <= 10^9
Time Limit: 1 sec
*/

public class Solution {
    public static int search(int []nums, int target) {
        //Your code goes here
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int p = -1;
        while(s<=e){
            // calculate the mid
            int mid = (s+e)/2;
            if(nums[mid] < target){
                s = mid + 1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                p = mid;
                break;
            }
        }

        return p;
    }

}

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();
        int result = Solution.search(arr, x);
        System.out.print(result);
    }
}