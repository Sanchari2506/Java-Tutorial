/*

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50

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
            int p = n;
            for(int i=1; i<=n; i++){
                
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(p);
                }
                p = p-1;
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
		
	}

}

