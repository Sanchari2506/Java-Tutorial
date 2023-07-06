package Lecture5.Assignment;
import java.util.Scanner;

public class TrianglePattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
    /*
     *
     **
     ***
     ****
     */
			// while(currRow <=n){
			// 	int currCol =1;
			// 		while (currCol<=currRow) {
			// 			System.out.print("*");
			// 			currCol++;
			// 		}
			// 	System.out.println();
			// 	currRow++;
			// }

    /*
     1
     22
     333
     4444
     */
			// while(i <=n){
			// 	int j =1;
			// 		while (j<=i) {
			// 			System.out.print(i);
			// 			j++;
			// 		}
			// 	System.out.println();
			// 	i++;
			// }

      /*
       * 1
       * 21
       * 321
       * 4321
       * 
       */
			while(i <=n){
				int j =i;
					while (j>0) {
						System.out.print(j);
						j--;
					}
				System.out.println();
				i++;
			}
		
	}

}
