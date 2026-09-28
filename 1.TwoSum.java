class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] digits = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    digits[0] = i;
                    digits[1] = j;
                    return digits;
                }
            }
        }

        return digits;
    }
}