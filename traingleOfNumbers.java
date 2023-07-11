/*

Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654

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
            // Loop through each row
            for (int i = 1; i <= n; i++) {
                // Print spaces for each row
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
    
                // Print the numbers in increasing order
                for (int j = i; j <= 2 * i - 1; j++) {
                    System.out.print(j);
                }
    
                // Print the numbers in decreasing order
                for (int j = 2 * i - 2; j >= i; j--) {
                    System.out.print(j);
                }
    
                System.out.println(); // Move to the next line
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}