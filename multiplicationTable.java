/*
Write a program to print multiplication table of n
Input Format :
    A single integer, n
Output Format :
    First 10 multiples of n each printed in new line
Constraints :
    0 <= n <= 10,000

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner reader = new Scanner(System.in);
        long n = reader.nextLong();
        if(n>=0 && n<=10000){
            // do the execution
            int i = 1;
            while(i<=10){
                long num = n*i;
                System.out.println(num);
                
                i++;
            }
            
        }
        else{
            // print the wrong input
            System.out.println("Wrong input. Integer should be less than 1000");
            return;
        }
	}
}