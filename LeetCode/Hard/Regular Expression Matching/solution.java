class Solution {
    private Boolean dp[][];
    
    public boolean isMatch(String s, String p) {
        dp=new Boolean[s.length()+1][p.length()+1];
        return dfs(s,p,0,0);
    }
    public boolean dfs(String s,String p,int i,int j){
        if(dp[i][j] != null) return dp[i][j];
        if(j==p.length()) return i==s.length();
        boolean match =i<s.length()&&(s.charAt(i)==p.charAt(j)||p.charAt(j)== '.');
        if (j+1<p.length()&&p.charAt(j+1)=='*'){
            dp[i][j]=dfs(s,p,i,j+2)||(match && dfs(s,p,i+1,j));
            return dp[i][j];
        }
        if(match) {
            dp[i][j]=dfs(s,p,i+1,j+1);
            return dp[i][j];
        }
        dp[i][j] = false;
        return false;
    }
}