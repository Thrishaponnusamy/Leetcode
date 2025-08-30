class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int ops = 0;
        int start = 0; // pointer to track the start of array

        while (true) {
            // Check if all elements from start to end are distinct
            boolean distinct = true;
            for (int i = start; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        distinct = false;
                        break;
                    }
                }
                if (!distinct) break;
            }
            if (distinct) break; // done if all distinct

            // Remove first 3 elements by moving the start pointer
            start += 3;
            ops++;
            if (start >= n) break; // array empty
        }

        return ops;
    }
}
