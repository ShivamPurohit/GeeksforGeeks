// { Driver Code Starts
import java.util.*;
public class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {int flag = 1;
                  for(int i=0;i<n;i++)
                  {
                      int num = a[i];
                      int originalnum = num;
                      int reversenum=0,remainder;
                      while(num!=0){
                          remainder=num % 10;
                          reversenum = reversenum *10 + remainder;
                          num /= 10;
                      }
                  
                      if(originalnum != reversenum){
                          flag = 0;
                          break;
                      }
                      
                      else{
                          flag =1;
                      }    
                      
                  }
                  return flag;
           }
}
