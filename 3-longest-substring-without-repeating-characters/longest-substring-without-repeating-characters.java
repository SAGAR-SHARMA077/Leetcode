class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for(int i=0;i<256;i++){
            hash[i]=-1;
        }

        int i=0,j=0;
        int max=0;
        while(j<s.length()){
            if(hash[s.charAt(j)]!=-1){
                if(hash[s.charAt(j)]>=i){
                    i=hash[s.charAt(j)]+1;
                }
            }
            int len=j-i+1;
            max=Math.max(len,max);
            hash[s.charAt(j)]=j;
            j++;
        }
        return max;

    }
}