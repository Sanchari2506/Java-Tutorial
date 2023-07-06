package Lecture5.Assignment;
import java.util.Scanner;

public class SquarePattern {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
    /* 4444
     * 4444
     * 4444
     * 4444
     */
    int currRow =1;
			 while(currRow <=n){
				int currCol =1;
					while (currCol<=n) {
						System.out.print(n);
						currCol++;
					}
				System.out.println();
				currRow++;
			}
		
	}

}
