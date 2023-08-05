class Solution {
    public int longestOnes(int[] nums, int k) {
        int strtpos = 0;
        int end = 0;
        int zero = 0;
            while(end < nums.length){
                if(nums[end] == 0){
                    zero++;
                }
                end++;
                if(zero > k){
                    if(nums[strtpos] == 0){
                        zero--;
                    }
                    strtpos++;
                }
            }
            return end - strtpos;
        }
    }
