class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count=0;
         HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        for(int i=0;i<n;i++){
           if(set.contains(nums[i] - diff) && set.contains(nums[i]-(diff*2))){
            count++;
           }
        //    e
            set.add(nums[i]);
        //    
           
        }
        return count;
    }
}