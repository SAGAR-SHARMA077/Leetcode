class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currsubsum = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<nums.length;i++){
            currsubsum = Math.max(nums[i] , currsubsum + nums[i]);
            maxsum = Math.max(maxsum ,currsubsum);
        }
        int currsubmin = nums[0];
        int minsum = nums[0];
        for(int i=1;i<nums.length;i++){
            currsubmin = Math.min(currsubmin + nums[i] , nums[i]);
            minsum = Math.min(currsubmin , minsum);
        }
        minsum = Math.abs(minsum);
        if(minsum>maxsum){
            return minsum;
        }
        return maxsum;
    }
}