/* 
Print the following pattern for the given N number of rows.
Pattern for N = 4
    4444
    4444
    4444
    4444
Input format :
    Integer N (Total no. of rows)
Output format :
    Pattern in N lines
Constraints
    0 <= N <= 50
Sample Input 1:
    7
Sample Output 1:
    7777777
    7777777
    7777777
    7777777
    7777777
    7777777
    7777777
Sample Input 1:
    6
Sample Output 1:
    666666
    666666
    666666
    666666
    666666
    666666
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
            for(int i=0; i<n; i++){
                // inner loop
                for(int j=0; j<n; j++){
                    System.out.print(n);
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}
