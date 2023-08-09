class Solution {
    public int pivotIndex(int[] nums) {
        int[] presum = new int[nums.length];
        int[] lastsum = new int[nums.length];
        presum[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            presum[i] = presum[i-1] + nums[i];
        }
        lastsum[nums.length - 1] = nums[nums.length - 1];

        for(int i = nums.length-2 ; i >= 0 ; i--){
            lastsum[i] = lastsum[i+1] + nums[i];
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(lastsum[i] == presum[i]){
                return i;
            }
        }
        return -1;
    }
}
