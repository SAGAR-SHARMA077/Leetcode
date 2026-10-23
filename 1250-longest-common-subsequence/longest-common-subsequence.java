class Solution {
        // int m ;
        // int n ;
        // int t[][] = new int[1001][1001];

     
        // int solve(String s1 , String s2 , int i, int j){
        //     if(i>=m || j>=n){
        //         return 0;
        //     }
        //     if(t[i][j] != -1){
        //         return t[i][j];
        //     }
        //     if(s1.charAt(i) == s2.charAt(j)){
        //         return t[i][j] = 1+ solve(s1,s2,i+1,j+1);
        //     }
        //     return t[i][j] = Math.max(solve(s1,s2,i+1,j) , solve(s1,s2,i,j+1));
        // }

    public int longestCommonSubsequence(String text1, String text2) {
       int m = text1.length();
       int n = text2.length();
       int[][] t = new int[m+1][n+1];
        // for(int i=0;i<1001;i++){
        //     Arrays.fill(t[i] , -1);
        // }
        for(int i=1 ;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
}