package Lecture10;
import java.util.Scanner;


public class sumOfTwoArray {

  public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {


      int i = arr1.length-1;
      int j = arr2.length-1;
      int k =output.length-1;

      int carry=0;

      while (i>=0 || j>=0 || carry !=0) {

        int val1 = i>=0 ? arr1[i] : 0;
        int val2 = j>=0 ? arr2[j] : 0;

        int sum = val1+val2+carry;

        int digit = sum % 10;
         carry = sum / 10;

         output[k] = digit;

        i--;
        j--;
        k--;
      }


 
  

 


  }


  
  public static void main(String[] args) {
  
 Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar1[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        ar1[i] = sr.nextInt();
    	    }
    	    int m = sr.nextInt();
    	    int ar2[] = new int[m];
    	    for(int i=0;i<m;i++)
    	    {
    	        ar2[i] = sr.nextInt();
    	    }
    	    
    	    int output[] = new int[Math.max(n,m) + 1]; 
    	    sumOfTwoArrays(ar1, ar2, output);
    	    for(int i = 0 ;i < output.length ;i++)
    	    {
    	        System.out.print(output[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }
}

}
