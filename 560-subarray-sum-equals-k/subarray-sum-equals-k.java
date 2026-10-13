class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res =0;
        int x=0;
        for(int i=0;i<nums.length;i++){
            
            x += nums[i];
           // int seen = x-k;
            if(map.containsKey(x-k)){
                res+=map.get(x-k);
                
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return res;
    }
}