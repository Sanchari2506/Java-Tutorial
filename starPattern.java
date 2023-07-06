/*

Print the following pattern
Pattern for N = 4

    *
   *** 
  *****
 *******

Hint
As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******

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
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                // int space = 1;
                // while(space <= n-i){
                //     System.out.print("-");
                //     space = space + 1;
                // }
                //inner loop for increasing number
                for(int j=1; j<=i; j++){
                    System.out.print('*');
                }
                
                // inner loop for decreasing number
                // for(int k=i-1; k>=i; k--){
                //     System.out.print("*");
                // }
                
                int dec = i-1;
                while(dec>=1){
                    System.out.print('*');
                    dec = dec -1;
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}