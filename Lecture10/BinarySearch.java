package Lecture10;
import java.util.Scanner;


public class BinarySearch {

  public static int search(int[] arr,int x){
      //Input: ‘N’ = 7 ‘target’ = 3
      //‘A’ = [1, 3, 7, 9, 11, 12, 45]
      int start =0;
      int end = arr.length -1;
    

      while (start <= end) {
       int mid = (start+end)/2;
        if(arr[mid] ==x){
          return mid;
        }else if(arr[mid] >x){
         end = mid-1; 
        }else{
          start = mid+1;
        }
        
      }
      return -1;
  }


  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = s.nextInt();
    }

    int x = s.nextInt();
    int result = search(arr, x);
    System.out.print(result);
}

}
