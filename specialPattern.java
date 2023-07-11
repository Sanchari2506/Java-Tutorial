/*

N=5

1234554321
1234**4321
123****321
12******21
1********1

*/


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		// Write your code here		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i =1; i<=n; i++){
			for(int j = 1; j<=n-i+1; j++){
				System.out.print(j);
			}
			//for star printing
			for(int s=1; s<=2*(i-1); s++){
				System.out.print("*");
			}

			//decreasing half
			for(int k = n-i+1; k>=1; k--){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
