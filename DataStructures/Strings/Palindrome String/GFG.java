//Execution Time:0.34
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {	
    static Scanner scan = new Scanner(System.in);
	public static void main (String[] args) {
	
		int t = scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
		    String s = "";
	         System.out.println(isPalindrome(s,n));
		}
	}
	public static String isPalindrome(String s,int n){
	    if(n>=1 && n<=100){
	        s = scan.next();
	    }
	    char[] ch = s.toCharArray();
	    String str = "";
	    for(int i=s.length()-1;i>=0;i--){
	        str += s.charAt(i);
	    }
	    if(s.equals(str)){
	        return "Yes";
	    }
	    return "No";
	}
}
