/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(t-- >0){
		    int count =0;
		    String s = scan.next();
		   int n = s.length();
		  for(int i=0;i<n;i++){
		  if((s.charAt(i) >=65 && s.charAt(i) <=90)||(s.charAt(i) >=97 && s.charAt(i) <=122)){
		          count +=1;
		        }
		  else{
		      count+=0;
		  }    
		    }
		    System.out.println(count);
		}
	}
}
