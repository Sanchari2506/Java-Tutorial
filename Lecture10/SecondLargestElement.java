package Lecture10;

import java.util.Scanner;

public class SecondLargestElement {
  


  public static int secondLargestElement(int[] arr, int d) {
      int l =Integer.MIN_VALUE;
      int sl = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {

        if(arr[i]>l){
          sl=l;
          l = arr[i];
        }else if(arr[i]<l && arr[i]>sl){
           sl = arr[i];
        }

      }

      return sl;
  }


  public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    int n=sr.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]= sr.nextInt();
    }
    int ans = secondLargestElement(ar,n);
    System.out.println(ans);
  }
}
