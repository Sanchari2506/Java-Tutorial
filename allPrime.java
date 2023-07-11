/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
    1 <= N <= 100
Sample Input 1:
    9
Sample Output 1:
    2
    3
    5
    7
Sample Input 2:
    20
Sample Output 2:
    2
    3
    5
    7
    11
    13
    17
    19
*/


import java.util.Scanner;
public class Solution {
    
    public static int isPrime(int n)
    {
        if (n <= 1) 
        {
            return 0;
        }
        
        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        
        return n;
    }

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(1<= n && n<=100){
		    //do the execution
		    for(int i=1; i<=n; i++){
		        int p = isPrime(i);
		        if(p == 0){
		            continue;
		        }
		        System.out.println(p);
		    }
		}
		else{
		    System.out.println("wrong input");
		}
		
	}
}

