import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-- >0){
		    int n= scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    }
		   System.out.println(checkSort(arr,n));
		}
	}
	public static int checkSort(int[] arr, int size){
	      if(size == 0 || size == 1){
	            return 1;
	        }
	    for(int i=1;i<size;i++){
	      
	        if(arr[i-1]>arr[i]){
	            return 0;
	        }}
	        
	            return 1;
	        
	    
	}
}
