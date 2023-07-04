package Lecture5;
import java.util.Scanner;

public class CharacterPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
		int i=1;


    /**
     * ABCD
     * BCDE
     * CDEF
     * DEFG
     */
   
    // while (i<=n) {
    //   int p=i;
    //   int j= 1;
      
    //   while (j<=n){
    //    char charRow = (char) ('A'+p-1);
    //     System.out.print(charRow);
    //     j++;
    //     p++;
    //   }
    //   System.out.println();
    //   i++;
    // }


    /**
     * a
     * bc
     * cde
     * defg
     */

      // while(i<=n){
      //     int j=1;
      //     int p=i;
      //     while (j<=i) {
      //       //  char charRow = (char) ('A'+j+i-2);
      //        char charRow = (char) ('A'+p-1);
      //         System.out.print(charRow);
      //         j++;
      //         p++;
      //     }
      //     System.out.println();
      //     i++;
      // }

    /**
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
     */
    while (i<=n) {
      int j=1;
      char ch = (char) ('A'+n-1);
      while (j<=i) {
        char chr = (char) (ch-i+j);
        System.out.print(chr);
        j++;
      }
      System.out.println();
      i++;
      
    }




	}

}
