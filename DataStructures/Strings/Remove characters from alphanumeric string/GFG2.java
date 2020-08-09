//Execution Time:0.33
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    String s = scan.next();
		    String str = "";
		    for(int i=0;i<s.length();i++){
		        if(Character.isDigit(s.charAt(i))){
		            str = str + s.substring(i,i+1);
		        }
		    }
		    System.out.println(str);
		}
	}
}
