class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        // int golaindex = -1;
        Arrays.sort(nums);
       // int trackindex ;
        while(true){
             List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        res.add(list);
        int golaindex = -1;

        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                golaindex= i-1;
                
                break;
            }
        }
        if(golaindex == -1){
            break;
        }

        int swapindex = golaindex;

        if(golaindex !=-2){
            for(int j=n-1;j>=golaindex+1;j--){
                if(nums[golaindex] < nums[j]){
                    swapindex = j;
                    break;
                }
            }
            int temp = nums[swapindex];
            nums[swapindex] = nums[golaindex];
            nums[golaindex] = temp;
        }

        for(int i= golaindex+1 ,j=n-1; i<j;i++,j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
       
    }
    return res;
    }
    
}