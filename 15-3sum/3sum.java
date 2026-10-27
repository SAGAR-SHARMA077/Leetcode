class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
       
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k = n-1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            else{
                int key = -(nums[i]);
            while(j<k){
                if(nums[j] + nums[k] >key){
                    k--;
                }
                else if(nums[j]+nums[k] <key){
                    j++;
                }
                else{
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;

                    List<Integer> list = new ArrayList<>();
                    list.add(-key);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    res.add(list);
                    j++;
                    k--;
                }
               }
            }

            }
        
        return res;
    }
}