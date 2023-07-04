package Lecture5;
import java.util.Scanner;

public class TrianglePattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
		int i=1;


    /**
     * 1
     * 12
     * 123
     * 1234
     * 
     */
    // while (i<=n) {
    //   int j=1;
      
    //   while (j<=i){
    //     System.out.print(j);
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }

        /**
     * 1
     * 23
     * 456
     * 78910
     * 
     */
    // int p=1;
    //  while(i<=n){
    //   int j=1;
     
    //     while (j<=i) {
    //       System.out.print(p);
    //       j++;
    //       p++;
    //     }
    //     System.out.println();
    //     i++;
    //  }

    /**
     * 1
     * 23
     * 345
     * 4567
     * 
     */
    // while (i<=n) {
    //   int j=1;
    //   int p=i;
    //   while (j<=i){
  
    //     System.out.print(p);
    //     j++;
    //     p++;
    //   }
    //   System.out.println();
    //   i++;
    // }

    while (i<=n) {
      int j=1;

      while (j<=i){
        System.out.print(j+i-1);
        j++;
      }

      System.out.println();
      i++;
    }


	}

}
