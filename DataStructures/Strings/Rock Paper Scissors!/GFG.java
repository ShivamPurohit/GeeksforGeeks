import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-- >0){
		String s = scan.next();
		if(s.equals("RR") || s.equals("PP") || s.equals("SS")){
		    System.out.println("DRAW");
		}
		else if(s.equals("RS") || s.equals("SP") || s.equals("PR")) {
		    System.out.println("A");
		} 
		else{
		    System.out.println("B");
		}
		    
		}
	}
}
