package Lecture6.Assignment;
import java.util.Scanner;

public class StarPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
    /***
     *   1  
     *  121
     * 12321
     * 
     */
		// int i=1;
    // while (i<=n) {
    //   int j=1;

    //   while (j<=n-i) {
    //     System.out.print(" ");
    //     j++;
    //   }     
      
    //   int k=1;
    //   while (k<=i) {
    //     System.out.print("*");
    //    k++; 
    //   }

    //   int jk=i-1;
    //   while (jk>=1) {
    //     System.out.print("*");
    //     jk--; 
    //   }

    //   System.out.println();
    //   i++;
    // }

    		int i=1;
    while (i<=n) {
      int j=1;

      while (j<=n-i) {
        System.out.print(" ");
        j++;
      }     
      
      int k=1;
      
      while (k<=2*i-1) {
        System.out.print("*");
       k++; 
      }

      System.out.println();
     
      i++;
    }


	}

}
