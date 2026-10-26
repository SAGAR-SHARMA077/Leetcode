class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
           int j=n-1;
           int h=0;
           while(h<=j){
            int temp = matrix[i][h];
            matrix[i][h] = matrix[i][j];
            matrix[i][j] = temp;
            j--;
            h++;
           }
        }
        
    }
}