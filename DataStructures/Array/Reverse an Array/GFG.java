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
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            int j=n-1;
            int[] arr2 = new int[n];
            for(int i=0;i<n;i++){
                arr2[i] = arr[j];
                j = j-1;
            }
            for(int i:arr2){
            System.out.print(i + " ");
            }
            System.out.println(" ");
        }
	}
}
