/* 

Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
    Two integers x and n (separated by space)
Output Format :
    x^n (i.e. x raise to the power n)
Constraints:
    0 <= x <= 8 
    0 <= n <= 9

*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();

        //check the inputs
        if((x>=0 && x<=8) && (n>=0 && n<=9)){
            //do something
            int total = 1;
            //when x == 0 and n == 0
            if(x==0 && n==0){
                total = 1;
            }else{
                for(int i=1; i<=n; i++ ){
                    total = total * x;
                }
            }
            
            System.out.println(total);
        }else{
            //wrong inputs
            System.out.println("wrong input");
        }
    }
}