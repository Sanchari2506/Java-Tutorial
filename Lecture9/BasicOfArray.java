package Lecture9;
import java.util.Scanner;


public class BasicOfArray {
 
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

    int arr[] = new int[10];
    arr[0]=5;
    arr[5]=15;
    System.out.println(arr[0]);
    System.out.println(arr[5]);
    System.out.println(arr[3]);
    //arr[-1] =18; //you cant do this
    //arr[10] =10; //also give error 

    char ch[] = new char[10];
    double dArray[] = new double[10];
    System.out.println(ch[0]);
    System.out.println(dArray[0]);

    boolean arra[] = new boolean[5];
    System.out.println(arra[0]);

    int arrIn[] = new int[5];
    arrIn[1] = 10;
    System.out.println(arrIn[1]);   
    arrIn = new int[2];
    System.out.println(arrIn[1]);   

	}

}
