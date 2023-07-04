package Lecture5;
import java.util.Scanner;

public class SquarePattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
		int i=1;

    /**
     * 1111
     * 2222
     * 3333
     * 4444
     * 
     */
    // while (i<=n) {
    //   int j=1;
      
    //   while (j<=n){
    //     System.out.print("*");
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }

    /**
     * 1234
     * 12344
     * 1234
     * 1234
     * 
     */
    // while (i<=n) {
    //   int j=1;
      
    //   while (j<=n){
    //     System.out.print(j);
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }

        /**
     * 4321
     * 4321
     * 4321
     * 4321
     * 
     */

     while(i<=n){
      int j=1;
        while (j<=n) {
          System.out.print(n-j+1);
          j++;
        }
        System.out.println();
        i++;
     }

	}

}
