package arrays;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		int size = arr.length;
		printSecondLargestElement(arr, size);
	}
	
	public static void printSecondLargestElement(int[] arr, int n) {
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i< n;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest)
				secondLargest = arr[i];
		}
		System.out.println("Largest: "+ largest+ " , SecondLargest: "+ secondLargest);
	}
}
