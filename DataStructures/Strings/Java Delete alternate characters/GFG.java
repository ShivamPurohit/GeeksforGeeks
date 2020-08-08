import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- >0){
	        String s = scan.next();
	        String str = "";
	        for(int i=0;i<s.length();i=i+2){
	            
	               str = str + s.charAt(i);
	            
	        }
	        System.out.println(str);
	    }
	}
}
