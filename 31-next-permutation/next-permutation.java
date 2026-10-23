class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        //first fullfill this condition from last of array nums[i-1]<nums[i]
        int golaIndex = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                golaIndex = i-1;
                break;
            }
        }
        if(golaIndex != -1){
        int swapIndex = golaIndex;
         for(int j=n-1 ; j>=golaIndex+1 ; j--){
            if(nums[golaIndex]<nums[j]){
                swapIndex = j;
                break;
            }
         }

         int temp = nums[swapIndex];
         nums[swapIndex] = nums[golaIndex];
         nums[golaIndex] = temp;
        }

         for(int i = golaIndex+1 ,j=n-1; i<=j;i++,j--){
            int temp2 = nums[i];
            nums[i] = nums[j];
            nums[j] = temp2;
         }

    
    }
}