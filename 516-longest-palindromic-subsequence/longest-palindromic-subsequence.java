class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        
        int m = s.length();
        int[][] t = new int[m+1][m+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1+ t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i][j-1] , t[i-1][j]);
                }

            }
        }
        return t[m][m];
    }
}