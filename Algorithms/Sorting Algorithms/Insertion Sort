//Time Complexity: O(n*2)
//Auxiliary Space: O(1)

public class Main{
    public static void main(String args[]){
        int arr[] = {18,17,20,5,2};
        int n = arr.length;
       Main m = new Main();
        m.sort(arr,n);
        m.printArray(arr,n);
    }
    void sort(int[] arr,int n){
         for(int i=1;i<n;++i){
             int j = i-1;
             int key = arr[i];
             
             while(j>=0 && arr[j]>key){
                 arr[j+1] = arr[j];
                 j=j-1;
             }
             
             arr[j+1] = key;
         }
    }
    
    void printArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
