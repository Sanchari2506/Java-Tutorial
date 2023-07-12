package Lecture9;
import java.util.Scanner;


public class InputArrFunction {

  
  public static void printArray(int[] arr){

    for (int i = 0; i < arr.length; i++) 
        System.out.println(arr[i]);

  }


  public static int[] InputArray(){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < arr.length; i++) {
          System.out.println("Please input the arary "+ i + "th value ");
          arr[i] = sc.nextInt();
      }

      return arr;

  }
	public static void main(String[] args) {

    int arr[] = InputArray();
    printArray(arr);
	}

}
