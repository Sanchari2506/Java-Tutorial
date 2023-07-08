/*
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2
*/

import java.util.Scanner;
public class Main {
	public static int findSquareRoot(int N) {
        if (N <= 0) {
            return 0;
        }

        int start = 1;
        int end = N;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid <= N / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
        // int number = 18; // Example number

        int squareRoot = findSquareRoot(number);
        System.out.println(squareRoot);
    }

}

