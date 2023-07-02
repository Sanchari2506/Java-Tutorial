/* 

Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :
    3 integers - S, E and W respectively 
Output Format :
    Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.
Constraints :
    0 <= S <= 90
    S <= E <=  900
    0 <= W <= 80 

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37

*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner reader = new Scanner(System.in);
        int S = reader.nextInt();
        int E = reader.nextInt();
        int W = reader.nextInt();
        // int S = 20;
        // int E = 119;
        // int W = 13;


        if ((S >= 0 && S <= 90) && (E >= S && E <= 900) && (W >= 0 && W <= 80)) {
            while (S <= E) {
                int C = (S - 32) * 5 / 9;
                System.out.println(S + " " + C);
                S = S + W;
            }
        } else {
            // Handle the case where the condition is not met
            System.out.println("Invalid input.");
        }
    }

}
