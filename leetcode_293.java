public void moveZeroes(int[] nums) {
        int pivotIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && i == pivotIndex) {
                pivotIndex++;
            } else if (nums[i] != 0) {
                nums[pivotIndex]=nums[i];
                nums[i]=0;
                pivotIndex++;
            }
        }
    }
