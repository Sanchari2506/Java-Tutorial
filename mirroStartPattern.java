/*
N = 5
*****
****
***
**
*

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
                
                for(int j=1; j<=n-i+1; j++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}
