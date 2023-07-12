package Lecture9;
import java.util.Scanner;


public class SumOfArr {

  



  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum +=arr[i];
    }
    return sum;
  }

  
  public static void main(String[] args)  {
    Scanner sr = new Scanner(System.in);
    int t = sr.nextInt();
    while(t > 0) 
    {
        int size = sr.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; ++i) 
        {
            input[i] = sr.nextInt();
        }
        System.out.println(sum(input));
        t -= 1;
    }
}

}
