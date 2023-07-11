package Lecture9;
import java.util.Scanner;


public class InputArray {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i <arr.length; i++) {
      System.out.print("Enter the element at "+  i + " th index");
      arr[i] = sc.nextInt();
    }

    for (int j = 0; j< arr.length; j++) {
      System.out.println(arr[j]);
    }
  

	}

}
