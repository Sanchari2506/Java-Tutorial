/*
input pattern:
N = 5
*
**
***
****
*****

mirror pattern:
    *
   **
  ***
 ****
*****
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
        if(0<=n && n<=26){
            //outer loop
            for(int i=1; i<=n; i++){
                int spaceCount = n-i;
                // inner loop for spaces
                for(int j=1; j<=spaceCount; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}
