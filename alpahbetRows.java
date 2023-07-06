/*
Print the following pattern for the given N number of rows.
when N=4
ABCD
ABCD
ABCD
ABCD

when N=3
ABC
ABC
ABC

Constrains:
1<=N<=26
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
                for(int j=1; j<=n; j++){
                    char jthChar = (char)('A'+j-1);
                    System.out.print(jthChar);
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}