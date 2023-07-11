/*
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/

import java.util.Scanner;
public class Main {
	
	public static int convertToDecimal(int binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            decimalNumber += lastDigit * Math.pow(2, power);
            power++;
            binaryNumber /= 10;
        }

        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int binaryNumber = n; // Example binary number

        int decimalNumber = convertToDecimal(binaryNumber);
        System.out.println(decimalNumber);
    }
}

