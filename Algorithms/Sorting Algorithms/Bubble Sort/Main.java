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
		System.out.println("After Sorting - Bubble Sort");
		
		Main m = new Main();
		m.bubbleSort(arr,n);
		
		for(int i:arr){
		    System.out.print(i + " ");
		}
	}
	
	public void bubbleSort(int[] arr,int n){
	 for(int i=0;i<n-1;i++){
	     for(int j=0;j<n-i-1;j++){
	         if(arr[j]>arr[j+1]){
	             int temp = arr[j];
	             arr[j] = arr[j+1];
	             arr[j+1] = temp;
	         }
	     }
	 }
	}
}
