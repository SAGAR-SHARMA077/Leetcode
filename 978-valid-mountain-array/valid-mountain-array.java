class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3){
            return false;
        }
        
        int i = 0;
        while(i+1<n ){
            if(arr[i] == arr[i+1]){
                return false;
            }
            if(arr[i]>arr[i+1]){
                break;
            }
            i++;
        }

        if(i+1==n || i==0){
            return false;
        }
        while(i+1<n ){
          
            if(arr[i]<=arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}