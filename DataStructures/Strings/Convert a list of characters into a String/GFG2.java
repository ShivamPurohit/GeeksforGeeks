//Execution Time:0.37
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
		    char[] ch = new char[n];
		    for(int i=0;i<n;i++){
		        ch[i] = scan.next().charAt(0);
		    }
		    String s = new String(ch);  /* The given character can be passed into the String constructor. By default, the character array contents are copied using the Arrays.copyOf()                                               method present in the Arrays class. */
		    System.out.println(s);
		}
	}
}
