//Execution Time:0.75
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    String s = scan.next();
		    char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String s2 = new String(ch);
            System.out.println(s2);
		}
	}
}
