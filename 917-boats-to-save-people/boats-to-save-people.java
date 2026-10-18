class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int min=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                min++;
            }
            else{
                if(people[j] <= limit){
                    j--;
                    min++;
                }
                else{
                    i++;
                    min++;
                }
            }
        }
        return min;
    }
}