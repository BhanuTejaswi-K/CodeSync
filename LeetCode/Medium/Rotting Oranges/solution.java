class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int row=grid.length,col=grid[0].length;
        Queue<int[]> queue=new LinkedList<int[]>();
        
        int fresh=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2) queue.add(new int[]{i,j});
                else if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;

        int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
        int mins=0;

        while(!queue.isEmpty() && fresh>0){
            int size=queue.size();
            boolean flag=false;
            for(int i=0;i<size;i++){
                int[] curr=queue.poll();
                for(int[] dir:directions){
                    int nr=curr[0]+dir[0];
                    int nc=curr[1]+dir[1];

                    if(nr >=0 && nr<row && nc>=0 && nc<col && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        queue.add(new int[]{nr,nc});

                        fresh-=1;
                        flag=true;
                    }
                }
            }
            if(flag) mins++;
        }
    return fresh == 0 ? mins : -1;
    }
}
