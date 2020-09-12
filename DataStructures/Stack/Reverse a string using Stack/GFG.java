// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            obj.reverse(sc.next());
        }
	}
}
// } Driver Code Ends



class Solution {
    
    public void reverse(String str){
       Stack<Character> stk = new Stack<>();
       char[] ch = str.toCharArray();
       int n = ch.length;
       for(int i=0;i<n;i++){
           stk.push(ch[i]);
       }
       char[] rev = new char[n];
       for(int i=0;i<n;i++){
        rev[i] = stk.pop();
       }
       System.out.println(toString(rev));
    }
    public String toString(char[] ch1){
        String s = new String(ch1);
        return s;
    }

}
