import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
		    int[] arr = new int[n];
		    boolean flag = false;
		    
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        
		        if(arr[i] == i+1){
		            flag = true;
		            System.out.print(arr[i] + " ");
		        } 
		    }
		    
		    if(!flag){
		        System.out.println("Not Found");
		       
		    }
		    else{
		         System.out.println();
		    }
		}
	}
}
