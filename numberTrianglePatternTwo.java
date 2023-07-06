/*
Print the following pattern for the given N number of rows with space.
Pattern for N = 7
Input:
6

Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int p = 1;
        // check the input value
        if(0<=n && n<=50){
            //outer loop
            for(int i=1; i<=n; i++){
                // inner loop
                for(int j=1; j<=i; j++){
                    System.out.print(p+" ");
                    p++;
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Wrong input");
        }
    }
}