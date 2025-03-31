class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int mlen = Integer.MAX_VALUE;
        int left = 0;
        // int right = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >=target) {
                sum = sum - nums[left];
                mlen = Math.min(i - left + 1, mlen);
                // sum = sum - nums[left++];
                left++;
            }
        }

        return mlen==Integer.MAX_VALUE? 0:mlen;
    }
}