import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = scan.nextInt();
		}
		System.out.println("After Sorting - Selection Sort");
		
		Main m = new Main();
		m.selectionSort(arr,n);
		
		for(int i:arr){
		    System.out.print(i + " ");
		}
	}
	
	public void selectionSort(int[] arr,int n){
	    for(int i=0;i<n-1;i++){
	        int min_index = i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[i]){
	                min_index = j;
	            }
	        }
	        
	        //swap
	        int temp = arr[min_index];
	        arr[min_index] = arr[i];
	        arr[i] = temp;
	    }
	}
}
