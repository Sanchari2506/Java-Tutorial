package Lecture9;
import java.util.Scanner;


public class SwapArr {

  public static void swapAlternate(int[] arr) {
    int size = arr.length;
    //int[] temp = new int[size];
    // for (int i = 0; i < arr.length; i++) {
    //   if(i%2==0){
    //     temp[i] = arr[i+1];
    //   }else{
    //     temp[i] = arr[i-1];
    //   }
    // }

    // for (int i = 0; i < temp.length; i++) {
    //   arr[i] = temp[i];
    // }


    for (int i = 0; i < size; i+=2) {
      int temp = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = temp; 
      
    }
   
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
        swapAlternate(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        t -= 1;
    }
}

}
