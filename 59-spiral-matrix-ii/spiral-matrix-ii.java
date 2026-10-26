class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a= new int[n][n];

        int num =1;
        int top=0,down=n-1,left=0,right=n-1;
        int dir =0;

        while(top<=down && left<=right){
            if(dir == 0){
                for(int i = left;i<=right;i++){
                    a[top][i] = num;
                    num++;
                }
                top++;
                dir++;
            }
            else  if(dir == 1){
                for(int i = top;i<=down;i++){
                    a[i][right] = num;
                    num++;
                }
                right--;
                dir++;
            }
            else  if(dir == 2){
                for(int i = right;i>=left;i--){
                    a[down][i] = num;
                    num++;
                }
                down--;
                dir++;
            }
            else  if(dir == 3){
                for(int i = down;i>=top;i--){
                    a[i][left] = num;
                    num++;
                }
                left++;
                dir++;
            }
            else{
                dir =0;
            }
        }
        return a;
    }
}