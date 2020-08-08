import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    String s = scan.next();
		    String s1 = "";
		    String s2 = "";
		    String s3 = "";
		    for(int i=0;i<s.length();i++){
		        if(Character.isAlphabetic(s.charAt(i))){
		        s1 = s1+s.substring(i,i+1);}
		        else if(Character.isDigit(s.charAt(i))){
		            s2 = s2+s.substring(i,i+1);
		        }
		        else{
		            s3 = s3+s.substring(i,i+1);
		        }
		    }
		    System.out.println(s1+"\n"+s2+"\n"+s3);
		}
	}
}
