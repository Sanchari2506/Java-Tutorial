package Lecture6.Assignment;
import java.util.Scanner;

public class SumPattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
    /***
     *  1=1
     * 1+2=3
     * 1+2+3=6
     */
		

    int currentRow =1;
    int sum = 0;

    while (currentRow<=n) {
      sum +=currentRow;
      int currentCol=1;

      while(currentCol<=currentRow){
          System.out.print(currentCol);
        if(currentCol==currentRow)
            System.out.print("=");
        else
            System.out.print("+");
          currentCol++;
      }
      System.out.println(sum);
      currentRow++;
    }




	}

}
