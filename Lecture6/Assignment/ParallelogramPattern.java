package Lecture6.Assignment;
import java.util.Scanner;

public class ParallelogramPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
    /*
         ****
          ****
           ****
            ****
     */
		

    int i =1;

    while (i<=n) {

      int j=1;

      while(j<=i-1){
        System.out.print(" ");
        j++;
      }
      
      int k=1;
      while(k<=n){
           System.out.print("*");
           k++;
      }
      System.out.println();
      i++;
    }




	}

}
