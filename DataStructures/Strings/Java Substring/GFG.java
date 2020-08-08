import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    String s = scan.next();
		    int l = scan.nextInt();
		    int r = scan.nextInt();
		    System.out.println(s.substring(l,r+1));
		}
	}
}
