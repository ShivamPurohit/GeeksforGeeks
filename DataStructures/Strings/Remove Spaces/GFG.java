//Execution Time:0.26
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	scan.nextLine();
	while(t-- >0){
	    String s = scan.nextLine();
	    
        s = s.replace(" ","");
	    System.out.println(s);
	}
	}
}
