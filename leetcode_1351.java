class Solution {
    public int countNegatives(int[][] grid) {
        int totalCount = 0;
		for (int i = 0; i < grid.length; i++) {
			int left = 0;
			int right = grid[i].length-1;
			int negetiveStartIndex = -1;
			if (grid[i][0] < 0) {
				totalCount += grid[i].length;
			} else {
				while (left <= right) {
					int middle = left + (right - left) / 2;
					if (grid[i][middle] < 0) {
						negetiveStartIndex = middle;
						right = middle - 1;

					} else {
						left = middle + 1;
					}
				}
			}
			if (negetiveStartIndex != -1) {
				totalCount += grid[i].length - negetiveStartIndex;
			}
		}
        return totalCount;
    }
}
