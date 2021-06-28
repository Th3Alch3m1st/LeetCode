    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> sortedList = new ArrayList<>();
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                sortedList.add(nums2[i]);
            }
        } else if (n == 0) {
            for (int i = 0; i < m; i++) {
                sortedList.add(nums1[i]);
            }
        } else {
            int index1 = 0;
            int index2 = 0;

            while (sortedList.size() < m + n) {
                if (nums1[index1] < nums2[index2]) {
                    sortedList.add(nums1[index1]);
                    if (index1 < m) {
                        index1++;
                    }
                } else if (nums1[index1] > nums2[index2]) {
                    sortedList.add(nums2[index2]);
                    if (index2 < n) {
                        index2++;
                    }
                } else {
                    sortedList.add(nums1[index1]);
                    if (index1 < m) {
                        index1++;
                    }
                    sortedList.add(nums2[index2]);
                    if (index2 < n) {
                        index2++;
                    }
                }

                if (index1 == m) {
                    for (int i = index2; i < n; i++) {
                        sortedList.add(nums2[i]);
                    }
                }
                if (index2 == n) {
                    for (int i = index1; i < m; i++) {
                        sortedList.add(nums1[i]);
                    }
                }
            }
        }
        for (int i = 0; i < sortedList.size(); i++) {
            nums1[i] = sortedList.get(i);
        }
    }
