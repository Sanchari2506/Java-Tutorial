package Lecture10;

public class ZeroLast {
  
  public static void ZeroAtLast(int[] arr){
    //Input: ‘N’ = 7 ‘target’ = 3
    //‘A’ = [2, 6, 9, 1, 5]
    int len = arr.length;
    int i = 0 ;
    int k = 0;
    int temp = 0;
             
    for(i = 0; i<len; i++){
      if (arr[i]!=0){
          
          //swap elements
          temp = arr[k];
          arr[k] = arr[i];
          arr[i] = temp;
          k++;
      }
  }
}


  public static void main(String[] args) {
    int arr[] = {3,0,2,1,0,0};
     ZeroAtLast(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" " );
      }
  }
}
