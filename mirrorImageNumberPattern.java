/*

Print the following pattern for the given N number of rows.
Pattern for N = 4

....1
...12
..123
.1234
12345

The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234

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
                int spaceCount = n-i;
                // inner loop for spaces
                for(int j=1; j<=spaceCount; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}
