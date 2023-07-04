package Lecture5;
import java.util.Scanner;

public class AlphaPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
		int i=1;


    /**
     * ABCD
     * ABCD
     * ABCD
     * ABCD
     */

    // while (i<=n) {
      
    //  int j= 1;
      
    //   while (j<=n){
    //     char charRow = (char) ('A'+j-1);
    //     System.out.print(charRow);
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }


    /**
     * a
     * bb
     * ccc
     * 
     */

      while(i<=n){
          int j=1;
          while (j<=i) {
              char charRow = (char) ('A'+i-1);
              System.out.print(charRow);
              j++;
          }
          System.out.println();
          i++;
      }



	}

}
