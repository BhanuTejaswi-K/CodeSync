class Solution {
    public int[][] generateMatrix(int n) {
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int cunt=1;
        int[][] ans=new int[n][n];
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ans[top][i]=cunt;
                cunt++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=cunt;
                cunt++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[bottom][i]=cunt;
                    cunt++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[i][left]=cunt;
                    cunt++;
                }
                left++;
            }
        }
        return ans;
    }
}