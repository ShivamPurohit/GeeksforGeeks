import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0){
		    int n = scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    }
		    int sum = 0;
		    for(int i=0;i<arr.length;i++){
		        sum += arr[i];
		    }
		    System.out.println(sum);
		    t--;
		}
	}
}
