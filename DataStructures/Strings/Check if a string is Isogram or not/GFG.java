// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG
 {
     
 // } Driver Code Ends


//This is a function problem
static boolean isIsogram(String data){
    data = data.toLowerCase();
    int length = data.length(); 
   char ch[] = data.toCharArray();
   Arrays.sort(ch);
   
   for(int i=0;i<length-1;i++){
       if(ch[i] == ch[i+1]){
           return false;
   }
   } 
       return true;
}

// { Driver Code Starts.
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            System.out.println(isIsogram(data)?"1":"0");
            
        }
	 }
}  // } Driver Code Ends
