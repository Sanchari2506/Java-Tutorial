package Lecture6;
import java.util.Scanner;

public class IsoscelesTrianglePattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
    /***
     *   1  
     *  121
     * 12321
     * 
     */
		int i=1;
    while (i<=n) {
      int j=1;
      
      while (j<=n-i){
        System.out.print(" ");
        j++;
      }

      int k=1;
      while (k<=i){
        System.out.print(k);
        k++;
      }

      int l=i-1;
      while (l>=1){
        System.out.print(l);
        l--;
      }
    
      System.out.println();
      i++;
    }

	}

}
