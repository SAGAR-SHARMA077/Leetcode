class Solution {
    public int compress(char[] chars) {
        int index =0;
        int count = 1;

        for(int i=0 ;i<chars.length;i++){
            if(i< chars.length -1 && chars[i] == chars[i+1]){
                count++;
            }
            else{
                chars[index ++] = chars[i];

                if(count>1){
                    String n = String.valueOf(count);

                    for(int j = 0 ; j<n.length();j++){
                        chars[index++] = n.charAt(j);
                    }
                }
                count =1;
            }
        }
        return index;  
    }
}