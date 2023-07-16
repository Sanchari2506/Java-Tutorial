package Lecture10;

import java.util.Scanner;

public class RotateArray {
  

  public static void reverse( int[] arr,int start, int end  ){
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start +=1;
      end -=1;
    }
  }
  public static void rotate(int[] arr, int d) {
    if(arr.length==0){
      return; 
    }
      
    
    if(d >= arr.length && arr.length !=0){
      d %=arr.length;
    }

    reverse(arr, 0, arr.length-1);
    reverse(arr, 0, arr.length-d-1);
    reverse(arr, arr.length-d,arr.length-1);

  }


  public static void main(String[] args) {
	    Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        ar[i]= sr.nextInt();
    	    }
    	    int d = sr.nextInt();
    	    rotate(ar,d);
    	    for(int i=0;i<n ;i++)
    	    {
    	        System.out.print(ar[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }
  }
}
