package Lecture7.Assignment;
import java.util.Scanner;

public class SumOrProduct {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int c = sc.nextInt();

    int num=0;
    int product=1;
    if(c==1){
      for (int i=1; i<=n; i++) {
        num +=i;
      }
    }else if(c==2){
      for (int i=1; i<=n; i++) {
          product *=i;
          num=product;
      }
    }else{
        num = -1;
    }
    System.out.println(num);
	}

}
