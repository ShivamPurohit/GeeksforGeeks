//Execution Time : 0.39
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    String s = scan.next();
		    StringBuilder s1 = new StringBuilder();
		    StringBuilder s2 = new StringBuilder();
		    StringBuilder s3 = new StringBuilder();
		    for(int i=0;i<s.length();i++){
		        if((s.charAt(i)>=65 && s.charAt(i)<=90) || 
		        (s.charAt(i)>=97 && s.charAt(i)<=122)){
		             s1 = s1.append(s.charAt(i)); 
		        }
		        else if(s.charAt(i)>=48 && s.charAt(i)<=57){
		            s2 = s2.append(s.charAt(i));
		        }
		        else{
		            s3 = s3.append(s.charAt(i));
		        }
		    }
		    System.out.println(s1+"\n"+s2+"\n"+s3);
		}
	}
}
