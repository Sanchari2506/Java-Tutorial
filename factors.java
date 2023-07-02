/* 

Write a program that takes a number as input and prints all its factors. If the number has only two factors (1 and the number itself), then the program should print -1.
Input Format :
    A single integer, n
Output Format :
    All the factors of n excluding 1 and the number itself
Constraints :
    0 <= n <= 10,000

*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        input.close();
        
        //check the input
        if(number>=0 && number<=10000){
            int count = 0;
            boolean flag = false;
            for (int i = 1; i <= number; i++){
                if(number%i == 0 && i != 1 && i != number){
                    System.out.print(i + " ");
                    flag = true;
                }else{
                    if((i == 1 || i == number) && flag == false){
                        count++;
                    }
                    
                }
            }
            
            if(count == 2){
                System.out.println(-1);
            }
            
        }else{
            //check the input
            System.out.print("wrong input");
        }
    }
}