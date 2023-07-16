package Lecture9;
import java.util.Scanner;


public class FindUniqueArr {

  public static int findUnique(int[] arr) {

    //2 3 1 6 3 6 2

    for (int i = 0; i < arr.length; i++) {
        int j;
      for ( j = 0; j < arr.length; j++) {

        if(i!=j){
          if(arr[i] == arr[j] ){
            break;
          }
        }
      }

        if(j == arr.length){
          return arr[i];
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
        System.out.println(findUnique(arr));
       
        t -= 1;
    }
}

}
