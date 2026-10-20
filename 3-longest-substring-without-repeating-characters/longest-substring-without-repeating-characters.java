class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);

        int i=0,j=0;
        int max=0;
        while(j<s.length()){
            if(hash[s.charAt(j)]!=-1){
                i = Math.max(hash[s.charAt(j)]+1,i);
            }
            int len = j-i+1;
            max = Math.max(max,len);
            hash[s.charAt(j)] = j;
            j++;
        }
        return max;
    }
}