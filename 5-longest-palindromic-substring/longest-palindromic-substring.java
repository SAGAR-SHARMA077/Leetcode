class Solution {
   static int[][] t = new int[1001][1001];
    static int isPalindrome(String s , int i, int j){
        if(i>=j){
            return 1;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
         if(s.charAt(i)==s.charAt(j)){
            return t[i][j] = isPalindrome(s,i+1,j-1);
        }
        
            return t[i][j] =0;
        
    }
    public String longestPalindrome(String s) {
        int max=0;
        int sp =0;
        for(int i=0;i<t.length;i++){
            Arrays.fill(t[i],-1);
        }

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)==1){
                    if(j-i+1 > max){
                        max = j-i+1;
                    sp = i;
                    }
                }
            }
        }
        return s.substring(sp,sp+max);
    }
}