package Lecture9;
import java.util.Scanner;


public class MaxArr {

  public static int[] InputArray(){
    Scanner sr = new Scanner(System.in);
    int n = sr.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the "+i+ " element value in array");
      arr[i] = sr.nextInt();
    }

    return arr;
  }


  public static void main(String[] args)  {
 
    int arr[] = InputArray();

    int max_size = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
    
        if(max_size<arr[i]){
          max_size = arr[i];
        }
    }

    System.out.println("Max value is "+ max_size);
  }

}
