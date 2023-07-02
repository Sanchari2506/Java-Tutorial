/* 

Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
    Integer N
Output format :
    Sum_of_Even_Digits Sum_of_Odd_Digits
    (Print first even sum and then odd sum separated by space)
Constraints
    0 <= N <= 10^8

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long evenSum = 0;
        long oddSum = 0;
        if(number>=0 && number<=100000000){
            while (number != 0) {
                long digit = number % 10; // Extract the last digit
                number /= 10; // Remove the last digit
    
                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
        System.out.println(evenSum+" "+oddSum);
        scanner.close();
        }else{
            System.out.println("Wrong input");
            return;
        }
	}
}
