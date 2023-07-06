/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
ABCD
BCDE
CDEF
DEFG
Input format :
    Integer N (Total no. of rows)
Output format :
    Pattern in N lines
Constraints
    0 <= N <= 26
*/

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        // check the input value
        if(0<=n && n<=50){
            //outer loop
            for(int i=1; i<=n; i++){
                // inner loop
                char p = (char)('A'+i-1);
                for(int j=1; j<=n; j++){
                    System.out.print(p);
                    p = (char)(p+1);
                    
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}