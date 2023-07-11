package Lecture9;
import java.util.Scanner;


public class PopulateArr {

  
  public static void arrange(int[] arr,int n){
    
    int start=0;
    int end =n-1;
    int counter=1;

    while (start<=end) {

        if(counter%2!=0){
          arr[start] = counter;
          counter++;
          start++;
        }else{
          arr[end] = counter;
          counter++;
          end--;
        }

    }

  }



	public static void main(String[] args) {

    Scanner sr = new Scanner(System.in);
    int t = sr.nextInt();
    while(t > 0) 
    {
        int n=sr.nextInt();
        int[] arr=new int[n];
        arrange(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        t -= 1;
    }
	}

}
