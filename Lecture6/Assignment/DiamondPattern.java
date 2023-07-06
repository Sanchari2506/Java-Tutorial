package Lecture6.Assignment;
import java.util.Scanner;

public class DiamondPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
    /***
     *     *  
     *    ***
     *   *****
     *  *******
     *   *****
     *    ***
     *     *
     */
		
    int firstHalf = (n+1)/2; //4
    int secondHalf = n/2;  //3


    int i=1;
    while (i<=firstHalf) {
      int spaces=1;

      while (spaces<=firstHalf-i) {
        System.out.print(" ");
        spaces++;
      }     
      
      int k=1;
      while (k<=(2*i)-1) {    
        System.out.print("*");
        k++;
      }
      System.out.println();
      i++;
    }

    int currentRow = secondHalf;

    while (currentRow>=1) {
      int space=1;
      while (space<=(secondHalf-currentRow+1)) {
          System.out.print(" ");
          space++;
      }

      int star=1;
      while (star<=(2*currentRow)-1) {
          System.out.print("*");
          star++;
      }
      System.out.println();

      currentRow--;
    }



	}

}
