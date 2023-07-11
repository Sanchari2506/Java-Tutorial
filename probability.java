/*

An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.
Input format :
Two spaced integers : n and x
Output format :
Integer part of (Probability * 100). 
Sample Input 1 :
3 1
Sample Output 1:
42

*/

import java.util.Scanner;

public class ProbabilityCalculator {

    public static int calculateProbability(int n, int x) {
        int numerator = binomialCoefficient(4, x) * binomialCoefficient(8 - 4, n - x);
        int denominator = binomialCoefficient(8, n);
        double probability = (double) numerator / denominator;
        int result = (int) (probability * 100);
        return result;
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n)
            return 1;

        int result = 1;
        int min = Math.min(k, n - k);

        for (int i = 1; i <= min; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int probability = calculateProbability(n, x);
        System.out.println(probability);
    }
}
