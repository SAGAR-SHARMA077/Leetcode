class Solution {
    public int countSubstrings(String s) {
        boolean[][] t = new boolean[s.length()][s.length()];

        for(int i=0;i<s.length();i++){
            Arrays.fill(t[i],false);
        }

        int count =0;

        for(int l=1;l<=s.length();l++){
            for(int i=0 ; i+l-1<s.length(); i++){
                int j = l+i-1;
                if(i==j){
                    t[i][i] = true;
                }
                else if(i+1 == j){
                    t[i][j] = (s.charAt(i)==s.charAt(j));
                }
                else{
                    t[i][j] = ((s.charAt(i)==s.charAt(j)) && t[i+1][j-1]);
                }
            
            if(t[i][j] == true){
                count++;
            }
            }
        }
        return count;
    }
}