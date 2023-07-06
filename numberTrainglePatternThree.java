// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int p = 1;
        // check the input value
        if(0<=n && n<=50){
            //outer loop
            for(int i=1; i<=n; i++){
                // inner loop
                p=i;
                for(int j=1; j<=i; j++){
                    System.out.print(p+" ");
                    p++;
                }
                System.out.println("\n");
                
            }
        }
        else{
            System.out.print("Wrong input");
        }
    }
}