class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        //int n = matrix[0].length;
        int c = (matrix[0].length)-1;
        while(c>=0 && r<matrix.length){
            if(matrix[r][c]>target){
                c--;
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else
            return true;

            }
            return false;
        }
    }
