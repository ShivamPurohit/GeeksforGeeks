// Execution Time : 0.3 sec
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG2 {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- >0){
	        String s = scan.next();
             StringBuilder strb  = new StringBuilder(s);
	           strb = strb.reverse();
	        System.out.println(strb);
	    }
	}
}
