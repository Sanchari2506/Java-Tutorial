package Lecture10;
import java.util.Scanner;


public class InsertionSort {

  public static void Insertion(int[] arr, int n) {
      //Input: ‘N’ = 7 ‘target’ = 3
      //'arr' = [2, 13, 4, 1, 3, 6, 28]
    
    for (int i = 1; i < arr.length; i++) { 
  int tmp =arr[i];
  int j = i-1;
      while(j>=0 && arr[j]>tmp){
      
    
        arr[j+1]=arr[j];
         j--;
      
      }

        arr[j+1] = tmp;
  
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
		Insertion(arr, n);
        	for(int i=0;i<n;i++)
        	{
            		System.out.print(arr[i]+" ");
        	}
   
}

}
