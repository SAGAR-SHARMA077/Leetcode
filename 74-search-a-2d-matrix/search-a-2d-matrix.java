class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
     //using binary search concept time complexity o(log(m*n))
     int n = matrix[0].length;//no of columns;
     int l =0;
     int r= (matrix.length)*(matrix[0].length)-1;
     while(l<=r){
        int mid = l+(r-l)/2;
        if(matrix[mid/(n)][mid%n] < target){
            l = mid+1;
        }
        else if(matrix[mid/(n)][mid%n] > target){
            r= mid-1;
        }
        else 
        return true;
     }





        // time complexity o(m+n)
        //  int r = matrix.length;
        // int c = matrix[0].length-1;
        //    int i=0,j=c;
        // while(i<r && j>=0){
        //     if(matrix[i][j]>target){
        //         j--;
        //     }
        //     else if(matrix[i][j]<target){
        //         i++;
        //     }
        //     else
        //     return true;
        // }
        return false;
    }
}