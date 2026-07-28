class Solution {
    public int minFallingPathSum(int[][] grid) {
       int n=grid.length;
       int prev[]=new int[n];
       for(int j=0;j<n;j++) prev[j]=grid[0][j];
        for(int i=1;i<n;i++){
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            int mincol=-1;
            for(int j=0;j<n;j++){
                 if (prev[j] < min1) {
                    min2 = min1;
                    min1 = prev[j];
                    mincol = j;
                } else if (prev[j] < min2) {
                    min2 = prev[j];
                }
            }
            int curr[]=new int[n];
            for(int j=0;j<n;j++){
                if(j==mincol)curr[j]=grid[i][j]+min2;
                else curr[j]=grid[i][j]+min1;
            }
            prev=curr;
        }
        int ans=Integer.MAX_VALUE;
        for(int i:prev) ans=Math.min(ans,i);
        return ans;

    }
}