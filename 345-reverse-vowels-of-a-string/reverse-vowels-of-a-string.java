class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowels ="aeiouAEIOU";
        if(s.length()==1){
            return s;
        }
        while(i<j){
            if(vowels.indexOf(a[i])!=-1 && vowels.indexOf(a[j])!=-1){
                char temp;
                temp=a[i];
                a[i]=a[j];
                a[j] = temp;
                i++;
                j--;
            }
            else if(vowels.indexOf(a[i])==-1){
                i++;
            }
            else{
                j--;
            }
        }
        String s2 =  new String(a);
        return s2;
    }
}