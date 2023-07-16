package Lecture10;
import java.util.Scanner;


public class SelectionSearch2 {

  public static void selectionSort(int[] arr){
      //Input: ‘N’ = 7 ‘target’ = 3
      //‘A’ = [2, 6, 9, 1, 5]
    
    for (int i = 0; i < arr.length-1; i++) { //0 ===5

      int min = arr[i];
      int minIndex =i;
      int j = i+1;

      for (; j < arr.length; j++) {
          min = arr[j];
          minIndex = j;

      }

      if(minIndex !=j){
            arr[minIndex] = arr[i];
            arr[i] = min;
      }



    }

  }


  
  public static void main(String[] args) {
  
    int arr[] = {2,6,9,1,15};

  selectionSort(arr);
    for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" " );
    }
   
}

}
