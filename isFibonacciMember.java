/*
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/
public class Solution {
	 public static boolean isFibonacciMember(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        
        int prev = 0;
        int curr = 1;
        
        while (curr <= num) {
            int next = prev + curr;
            if (next == num) {
                return true;
            }
            prev = curr;
            curr = next;
        }
        
        return false;
    }
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

        boolean isMember = isFibonacciMember(n);
        // System.out.println(isMember);
		return isMember;

	}
	

}
