class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        //int i = 0;
        //int j = (row)*(col)-1;
        k = k%(row*col);
        for(int i=0,j=row*col -1 ; i<j ; i++,j--){
            int temp = grid[i/col][i%col];
            grid[i/col][i%col] = grid[j/col][j%col];
            grid[j/col][j%col] = temp;
        }

        for(int i=0,j=k-1 ; i<j ; i++,j--){
            int temp = grid[i/col][i%col];
            grid[i/col][i%col] = grid[j/col][j%col];
            grid[j/col][j%col] = temp;
        }

        for(int i=k,j=row*col-1 ; i<j ; i++,j--){
        int temp = grid[i/col][i%col];
        grid[i/col][i%col] = grid[j/col][j%col];
        grid[j/col][j%col] = temp;
        }

        List<List<Integer>> res = new  ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> r = new ArrayList<>();

            for(int j=0;j<col;j++){
                r.add(grid[i][j]);
            }
            res.add(r);
        }
        
        return res;
    }
}