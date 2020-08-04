import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		if(t>=0 && t<=20){
		while(t-- >0){
		    int n = scan.nextInt();
		    if(n>=1 && n<=100){
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        int value = scan.nextInt();
		        if(value>=1 && value<=100){
		        arr[i] = value;}
		    }
		    for(int i:arr){
		        System.out.print(i + " ");
		    }
		    System.out.println(" ");
		    }
		}
		}
	}
}
