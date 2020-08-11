import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		scan.nextLine();
		while(t-- >0){
		    String s = scan.nextLine();
		    int count=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)>=65 && s.charAt(i)<=90){
		            count++;
		        }
		    }
		    System.out.println(count+1);
		}
	}
}
