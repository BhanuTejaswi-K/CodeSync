class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        if(n==0) return -1;

        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int totalSum=prefix[n-1];
        for(int i=0;i<n;i++){
            int leftsum=(i>0)?prefix[i-1]:0;
            int rightsum=totalSum-prefix[i];

            if(rightsum==leftsum) return i;
        }
        return -1;
    }
}