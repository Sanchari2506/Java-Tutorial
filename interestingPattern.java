/*

Print the following pattern for the given number of rows.
Pattern for N = 5
    E
    DE
    CDE
    BCDE
    ABCDE
Input format :
    N (Total no. of rows)
Output format :
    Pattern in N lines
Constraints
    0 <= N <= 26

*/

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
		Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        // check the input value
        if(0<=n && n<=26){
            //outer loop
            for(int i=1; i<=n; i++){
                // inner loop
                char p = (char)('A'+n-i);
                for(int j=1; j<=i; j++){
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