class Solution {
    public int maxProduct(int[] nums) {
        int maxpro =Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        for(int i=0;i<nums.length;i++){
          if(pre == 0){
            pre =1;
          }
          if(suf== 0){
            suf =1;
          }
          pre = pre*nums[i];
          suf = suf*nums[nums.length -i-1];

          maxpro = Math.max(maxpro, Math.max(pre,suf));
        }
        return maxpro;
    }
}