import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- >0){
	        String s = scan.next();
	        
	        if(s.charAt(0) >= 65 && s.charAt(0) <= 90){
	            System.out.println(s.toUpperCase());
	        }
	         else if(s.charAt(0) >= 97 && s.charAt(0) <= 122){
	            System.out.println(s.toLowerCase());
	        }
	    }
	}
}
