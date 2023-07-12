public class MyClass {
    public static void printAllPairs(int[] arr){
        int size = arr.length;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size-1; j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        printAllPairs(arr);
    }
}