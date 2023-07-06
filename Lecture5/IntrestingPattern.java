package Lecture5;
import java.util.Scanner;

public class IntrestingPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
		int i=1;


    /**
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
     */

      while(i<=n){
          int j=1;
          char ch = (char) ('A'+ n -i);
          while (j<=i) {
            //  char charRow = (char) ('A'+j+i-2);
             char charRow = (char) (ch+j-1);
              System.out.print(charRow);
              j++;
        
          }
          System.out.println();
          i++;
      }



	}

}
