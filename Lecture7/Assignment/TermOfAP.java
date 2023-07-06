package Lecture7.Assignment;
import java.util.Scanner;

public class TermOfAP {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int count=1;


    int i=1;

    while (count<=n) {

      int nthTerm = (3*i)+2;

      if(nthTerm%4!=0){
        System.out.print(nthTerm+" ");
        count++;
      }

      i++;
      
    }
    
	}

}
