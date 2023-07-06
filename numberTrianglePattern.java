/*
Print the following pattern for the given N number of rows.
Pattern for N = 7
Input:
    7

Output:
    0
    01
    012
    0123
    01234
    012345

Constraints:
    0 <= N <= 50

*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        // check the input value
        if(0<=n && n<=50){
            //outer loop
            for(int i=0; i<n; i++){
                // inner loop
                for(int j=0; j<i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
    }
}