class Solution {

    static boolean isPalindrome(String s , int i, int j){
        if(i>=j){
            return true;
        }
        else if(s.charAt(i)==s.charAt(j)){
            return isPalindrome(s,i+1,j-1);
        }
        else{
            return false;
        }
    }
    public String longestPalindrome(String s) {
        int max=0;
        int sp =0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
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