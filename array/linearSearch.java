/*

You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.
 You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.
'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of X(integer to be searched in the given array/list)
Output format :
For each test case, print the index at which X is present or -1, otherwise.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
-2 ^ 31 <= X <= (2 ^ 31) - 1
Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
3
Sample Output 1:
4
Sample Input 2:
2
7
2 13 4 1 3 6 28
9
5
7 8 5 9 5      
5
Sample Output 2:
-1
2

*/

import java.util.Scanner;

public class Solution {

    public static int linearSearch(int arr[], int x) {
		    //Your code goes here
        int size = arr.length;
        int num = -1;

        // System.out.println(num);
        
        
        for(int i=0; i<size; i++){
          if(arr[i] == x){
            num = i;
            break;
          }
        }
        return num;
        
    }

}
public class Runner {

    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int size = sr.nextInt();
            int[] input = new int[size];
            for (int i = 0; i < size; ++i) 
            {
                input[i] = sr.nextInt();
            }
            int val = sr.nextInt();
            System.out.println(Solution.linearSearch(input,val));
            t -= 1;
        }
    }
}