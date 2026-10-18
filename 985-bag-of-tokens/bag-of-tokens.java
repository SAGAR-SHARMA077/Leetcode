class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j = tokens.length-1;
        //int c =0;
        int max = 0;
        if(tokens.length == 0){
            return max;
        }
        if(power<tokens[i]){
            return max;
        }
        int score=0;
        while(i<=j ){
            //int score=0;
            if(power>=tokens[i]){
                power-=tokens[i];
                score+=1;
                i++;
               // c++;
                max = Math.max(max,score);
            }
             else if(score>=1){
               
                    power+=tokens[j];
                    j--;
                    score--;  
            }
            else{
                return max;
            }
        }
        return max;
    }
}