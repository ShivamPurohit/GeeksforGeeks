//Execution Time:0.47
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
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)>=48 && s.charAt(i)<=57){
		            str += s.charAt(i);
		        }
		        else{
		            str += "";
		        }
		    }
		    System.out.println(str);
		}
	}
}
