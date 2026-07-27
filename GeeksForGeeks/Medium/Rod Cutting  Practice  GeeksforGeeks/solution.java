class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[]=new int[n+1];
        for(int len=1;len<=n;len++){
            int maxvalue=0;
            for(int cut=1;cut<=len;cut++){
                maxvalue=Math.max(maxvalue,price[cut-1]+dp[len-cut]);
                
            }
            dp[len]=maxvalue;
        }
        return dp[n];
    }
}