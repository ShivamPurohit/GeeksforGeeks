import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
 
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
        
		while(t>0){int n = scan.nextInt();
		    int[] a = new int[n];
		for(int i =0;i<n;i++){
		a[i] = scan.nextInt();
		}
		
	System.out.println(Asort(a,n));
	
		    t--;
		}
	}
	
	public static int Asort(int[] arr,int k){
	    Arrays.sort(arr);
	   
	    return arr[k-2];
	    
	}
}
