package Lecture6.Assignment;
import java.util.Scanner;

public class OddSquarePattern {
 
  /*
   * 13579
   * 35791
   * 57913
   * 79135
   * 91357
   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
  

    int currentRow =1;

    while (currentRow <=n) {
        int valueToPrint = (2*currentRow)-1;
        int currentCol = n;

        while (currentCol>0) {
         
            System.out.print(valueToPrint);
            valueToPrint +=2;

            if(valueToPrint>(2*n)-1){
              valueToPrint =1;
            }
          currentCol--;
        }
        System.out.println();

      currentRow++;
      
    }



	}

}
