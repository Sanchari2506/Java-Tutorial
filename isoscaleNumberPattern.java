/*
N = 6

     1
    121
   12321
  1234321
 123454321
12345654321

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
                    System.out.print(j);
                }
                
                // inner loop for decreasing number
                // for(int k=i-1; k>=i; k--){
                //     System.out.print("*");
                // }
                
                int dec = i-1;
                while(dec>=1){
                    System.out.print(dec);
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