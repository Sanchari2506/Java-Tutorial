/*

Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5

  *
 ***
*****
 ***
  *

The dots represent spaces.


Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *

*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStars = scanner.nextInt();

        printPattern(maxStars);
    }

    // function definition
    public static void printPattern(int maxStars) {
        // the input should be odd number, then this patter will work
        
        if(1<=maxStars && maxStars<=49 && maxStars%2 != 0){
            int rows = (maxStars + 1) / 2;
            int maxSpaces = rows - 1;
    
            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j = 1; j <= maxSpaces; j++) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
    
                // Move to the next line
                System.out.println();
    
                // Decrease the number of spaces for the next row
                maxSpaces--;
            }
    
            maxSpaces = 1;
    
            for (int i = 1; i <= rows - 1; i++) {
                // Print spaces
                for (int j = 1; j <= maxSpaces; j++) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int k = 1; k <= maxStars - 2 * maxSpaces; k++) {
                    System.out.print("*");
                }
    
                // Move to the next line
                System.out.println();
    
                // Increase the number of spaces for the next row
                maxSpaces++;
            }
        }
        else{
            System.out.println("wrong input. The input should be odd number");
        }
    }

}