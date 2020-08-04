import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0){
		    int[] a = new int[3];
		    int[] b = new int[3];
		    for(int i=0;i<3;i++){
		        a[i] = scan.nextInt();
		    }
		    for(int i=0;i<3;i++){
		        b[i] = scan.nextInt();
		    }
		    int Acount =0,Bcount =0;
		    for(int i=0;i<3;i++){
		        if(a[i]>b[i]){
		            Acount++;
		        }
		        else if(a[i]<b[i]){
		            Bcount++;
		        }
		        else{
		            Bcount += 0;
		            Acount += 0;
		        }
		    }
		    System.out.println(Acount +" "+Bcount);
		   }
	}
}
