// Execution Time : 0.33 sec
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG1 {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- >0){
	        String s = scan.next();
       
	        String str ="";
	        for(int i=s.length()-1;i>=0;i--){
	            str = str+s.charAt(i);
	        }
	        System.out.println(str);
	    }
	}
}
