class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int []dp=new int [capacity+1];
        
        for(int i=0;i<=capacity;i++){
            dp[i]=i/wt[0]*val[0];
            
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=capacity;j++){
                int notpick=dp[j];
                int pick=0;
                if(wt[i]<=j){
                    pick=val[i]+dp[j-wt[i]];
                }
                dp[j]=Math.max(pick,notpick);
                
            }
        }
        return dp[capacity];
        
    }
    
}