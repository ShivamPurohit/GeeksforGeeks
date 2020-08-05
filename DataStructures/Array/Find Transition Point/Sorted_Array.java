// { Driver Code Starts
import java.util.*;

public class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        
            int index = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 0){
                  index++;
                    
                    if(arr[i] == arr[n-1]){
                        return -1;
                    
                    }
                    continue;
                }
               
                else{
                   break;
                }
                
            }
            
            return index;
    }
        
        }
    
    
