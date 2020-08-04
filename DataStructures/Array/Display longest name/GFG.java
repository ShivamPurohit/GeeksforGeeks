import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		try {
		while(t>0){
		    int n=scan.nextInt();
		    String[] s = new String[n];
		    for(int i=0;i<n;i++){
		        s[i] = scan.next();
		       
		    }
		   
		    int ans = s[0].length();
		    int index =0;
		    
		    for(int i=1;i<s.length;i++){
		        if(s[i].length()>ans){
		            index=i;
		        ans = s[i].length();
		           
		        }
		      
		    }
		    System.out.println(s[index]);
		    t--;
		}

} catch (InputMismatchException e) {
    System.out.print(e.getMessage()); 
}
	}
}
