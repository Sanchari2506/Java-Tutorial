package Lecture10;
import java.util.Scanner;


public class MergeSortedArr {

  public static int[] merge(int arr1[], int arr2[]) {
      //Input: ‘N’ = 7 ‘target’ = 3
//1 3 4 7 11
//2 4 6 13

    int i=0;
    int j=0;
    int k=0;

    int m=arr1.length;
    int n =arr2.length;
    int ans[] = new int[m+n];
    System.out.println(ans.length);
    while (i<m && j<n) {
      
      if(arr1[i]<arr2[j]){
        ans[k] = arr1[i];
        i++;
        k++;
      }else{
        ans[k] = arr2[j];
          j++;
          k++;
      }

    }
    while(i<m){
        ans[k] = arr1[i];
        i++;
        k++;
    }
    while(j<n){
        ans[k] = arr2[j];
        j++;
        k++;
    }
    return ans;
  }


  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i] = sc.nextInt();
		    }
		    int m = sc.nextInt();
		    int[] arr2 = new int[m];
		    for(int i=0;i<m;i++)
		    {
		        arr2[i] = sc.nextInt();
		    }
		    int[] ans = new int[m+n];
		    ans = merge(arr1, arr2);
            for(int i=0;i<m+n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t-=1;
		}
}

}
