/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t=scan.nextInt();
	    while(t >0){
	        
	        int n= scan.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = scan.nextInt();
	        }
	       int k=1;
	        System.out.println(pro(arr,k));
	        
	        t--;
	    }
	}
	public static int pro(int[] array,int product){
	        
	        for(int i=0;i<array.length;i++){
	            
	            product = product * array[i];
	           
	        }
	        return product;
	}
}
