class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int presum = 0;
        for(int i=0; i<gain.length; i++){
            presum = presum+gain[i];
            max = Math.max(presum , max);
        }        
        return max;
    }
}
