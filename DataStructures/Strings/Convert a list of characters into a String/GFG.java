//Execution Time:0.35
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
		    char[] ch = new char[n];
		    for(int i=0;i<n;i++){
		        ch[i] = scan.next().charAt(0);
		    }
		    StringBuilder s = new StringBuilder();
		    for(Character c : ch){
		        s.append(c);
		    }
		    System.out.println(s);
		}
	}
}
