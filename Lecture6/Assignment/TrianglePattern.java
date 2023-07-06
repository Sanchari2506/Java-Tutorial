package Lecture6.Assignment;
import java.util.Scanner;

public class TrianglePattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
    /***
     *     1  
     *    232
     *   34543
     *  4567654
     * 
     */
		

    		int i=1;
    while (i<=n) {
      int j=1;

      while (j<=n-i) {
        System.out.print(" ");
        j++;
      }     
      
      int k=1;
      int val = i;
      while (k<=i) {
        System.out.print(val++);
       k++; 
      }

       int jk=i-1;
       int valprint = 2*i-2;
      while (jk>=1) {
        System.out.print(valprint);
        valprint--;
       jk--; 
      }

      System.out.println();
     
      i++;
    }


	}

}
