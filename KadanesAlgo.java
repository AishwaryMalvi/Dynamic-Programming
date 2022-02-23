package DynamicProgramming;

public class KadanesAlgo {
	
	public static int maxSubArraySum(int[] arr) {
		int currentmax = arr[0];
		int maxsofar = arr[0];
		for(int i=1;i<arr.length;i++) {
			currentmax = currentmax+arr[i]; //element become part of current subarray
			if(currentmax<arr[i]) {
				currentmax = arr[i];  // element decide to start its own subarray
		}
			if(maxsofar < currentmax) {
				maxsofar = currentmax;
			}
	}
		return maxsofar;
}
	
	public static void main(String[] args) {
		int[] arr = {4, 9, -3, 90,47,52,-78,59};
		System.out.println(maxSubArraySum(arr));
	}
}
