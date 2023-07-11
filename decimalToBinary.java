/*

Given a decimal number (integer N), convert it into binary and print.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111

*/

import java.util.Scanner;
public class Main {
	public static String convertToBinary(long decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder();

		if(decimalNumber == 0){
			binaryNumber.append(0);
		}

        while (decimalNumber > 0) {
            long remainder = decimalNumber % 2;
            binaryNumber.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long decimalNumber = n; // Example decimal number
        
        if(0<=n && n<=100000){
            String binaryNumber = convertToBinary(decimalNumber);
            System.out.println(binaryNumber);
        }
        else{
            System.out.println("wrong input");
        }
        
    }

}

