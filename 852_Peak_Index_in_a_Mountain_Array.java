class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
		int right = arr.length;
		int maxValue = 0;
		int maxIndex = 0;
		while (left<right) {
			int middle = (left +right)/2;
			if(arr[middle]>maxValue) {
				maxValue = arr[middle];
				maxIndex = middle;
					
			}
			else if(arr[middle]>arr[middle+1]) {
				right = middle - 1;
				if(arr[right]>maxValue) {
					maxValue = arr[right];
					maxIndex = right;
						
				}
			}else {
				left = middle +  1;
				if(arr[left]>maxValue) {
					maxValue = arr[left];
					maxIndex = left;
						
				}
			}
		}
        return maxIndex;
    }
}
