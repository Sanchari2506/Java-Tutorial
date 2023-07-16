package Lecture10;
import java.util.Scanner;


public class BubbleSort {

  public static void bubbleSort(int[] arr, int n) {
      //Input: ‘N’ = 7 ‘target’ = 3
      //‘A’ = [21, 6, 9, 1, 5]
    
    for (int i = 0; i < arr.length-1; i++) { 

      for (int j = 0; j < arr.length-1-i; j++) {
        
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }


    }

  }


  
  public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		bubbleSort(arr, n);
        	for(int i=0;i<n;i++)
        	{
            		System.out.print(arr[i]+" ");
        	}
   
}

}
