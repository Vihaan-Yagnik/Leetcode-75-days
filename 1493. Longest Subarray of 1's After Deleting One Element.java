class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < nums.length) {
            if(nums[right] == 0) zeroCount++;

            while(zeroCount > 1) {
                if(nums[left] == 0) zeroCount--;
                left++;
            }

            max = Math.max(max, right - left + 1);

            right++;
        }

        return max - 1;
    }
}
