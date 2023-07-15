public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n = arr.length;
        for(int i =0; i<=n-1; i++){
            int min = Integer.MAX_VALUE;
            int min_index = Integer.MIN_VALUE;
            for(int j=i; j<=n-1; j++){
                // finidng the min value
                if(arr[j]<min){
                    min = arr[j];
                    min_index = j;
                }
            }

            //swap the elements between two indexes
            int tmp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tmp;

        }
    }
}

//Main code
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Runner {
    public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine());
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        String nextL() throws IOException {
            return br.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t;
    private static int []n;
    private static int [][]arr;

    private static void takeInput() throws IOException {
        t = 1;
        n = new int[t];
        arr = new int[t][];
        for (int i = 0; i < t; ++i) {
            n[i] = sc.nextInt();
            arr[i] = new int[n[i]];
            for(int j = 0; j < n[i]; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    private static void execute() {
        for (int i = 0; i < t; ++i) {
            Solution.selectionSort(arr[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; ++i) {
            Solution.selectionSort(arr[i]);
            for(int j : arr[i])
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        takeInput();
        executeAndPrintOutput();
    }

}