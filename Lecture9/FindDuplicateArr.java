package Lecture9;
import java.util.Scanner;


public class FindDuplicateArr {

  public static int duplicateNumber(int[] arr) {

    //0 7 2 5 4 7 1 3 6+

    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {

          if (arr[i] == arr[j]) {
            return arr[i];
          }
        
      }
        
    }

return Integer.MAX_VALUE;
  }

  
  public static void main(String[] args)  {
    Scanner sr = new Scanner(System.in);
    int t = sr.nextInt();
    while(t > 0) 
    {
        int n=sr.nextInt();
        int[] arr=new int[n];
        for (int i =0 ; i<n;i++)
        {
            arr[i]=sr.nextInt();
        }
        System.out.println(duplicateNumber(arr));
       
        t -= 1;
    }
}

}
