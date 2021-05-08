class Solution {
    public int searchInsert(int[] nums, int target) {
        int foundIndex = -1;
		int insertionIndex = -1;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (nums[middle] == target) {
				foundIndex = middle;
				break;
			} else if (nums[middle] < target) {
				left = middle + 1;
				insertionIndex = left;
			} else if (target < nums[middle]) {
				right = middle - 1;
			}
			if(left>right) {
				break;
			}	
		}
		if(foundIndex != -1) {
            return foundIndex;
		}else {
			if(insertionIndex == -1){
                return 0;
            }else{
                return insertionIndex;
            }
		} 
    }
}
