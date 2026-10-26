class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;

        int top = 0,down=n-1,left=0,right=m-1;
        int dir =0;

        ArrayList<Integer> list = new ArrayList<>();

        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
                dir++;
            }
            else if(dir == 1){
                for(int i=top;i<=down ;i++){
                    list.add(matrix[i][right]);
                }
                right--;
                dir++;
            }
            else if(dir == 2){
                for(int i=right ; i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
                dir++;
            }
            else if(dir == 3){
                for(int i=down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
                dir++;
            }
            else{
                dir = 0;
            }
            
        }
        return list;
    }
}