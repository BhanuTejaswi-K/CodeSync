class Solution {

    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,char[][] grid){
        grid[row][col]='0';
        int m=grid.length,n=grid[0].length;
        int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
        for(int[] dir:directions){
            int nr = row + dir[0];
            int nc = col + dir[1];

            if(nr >= 0 && nc >= 0 &&
               nr < m && nc < n &&
               grid[nr][nc] == '1') {

                dfs(nr, nc, grid);
            }
        }
    }
}