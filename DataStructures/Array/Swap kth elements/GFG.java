import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	   
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    } 

		        int temp = arr[x-1];
		        arr[x-1] = arr[n-x];
		        arr[n-x] = temp;
		    for(int i:arr)  
		 System.out.println(i);}
		}
	}
