class Solution {
    public int minChanges(String s) {
        int left=0;
        int res=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(left)!=s.charAt(right))
            {
                if(right%2==1) res++;
            } 
            left=right;
        }
        return res;
    }
}