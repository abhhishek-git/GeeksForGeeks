package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_UsingHashMap {
	public static void main(String[] args) {
		int[] arr = {2,2,2,2,5,5,2,3,3};
		int size = arr.length;
		majorityElementMethod(arr, size);
}
	
	public static void majorityElementMethod(int[] arr, int n) {
		Map map = new HashMap<Integer, Integer>();
		int count =0;
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				count = (int) map.get(arr[i]) +1;
				if(count > n/2) {
					System.out.println("Majority Element is :" + arr[i]);
					return;
				}
				else
					map.put(arr[i], count);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("No majority element found");
	}
}
