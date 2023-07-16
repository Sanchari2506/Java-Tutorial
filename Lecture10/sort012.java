package Lecture10;
import java.util.Scanner;


public class sort012 {

  public static void sort01(int[] arr){
      //Input: ‘N’ = 7 ‘target’ = 3
      //‘A’ = [0,1,2,0,2,0,1]
 
      int i=0;
      int nextZero=0;
      int nextTwo=arr.length-1;

      while (i<=nextTwo){

        if(arr[i] ==0){
          int temp = arr[nextZero];
          arr[nextZero] = arr[i];
          arr[i] = temp;
          i++;
          nextZero++;

        }
        else if(arr[i] ==2){
            int temp=arr[i];
            arr[i] = arr[nextTwo];
            arr[nextTwo] = temp;
            nextTwo--;

        }
        else{
            i++;
        }
        

      }


  }


  
  public static void main(String[] args) {
  
    int arr[] = {0,1,2,0,2,0,1};

     sort01(arr);
    for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" " );
    }
   
}

}
