class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int arr[] = new int[2*n + 1];
        java.util.Arrays.fill(arr, -2);
        arr[n]=-1; 
        int maxLen=0;
        int prefixSum=0;
        for(int i=0;i<n;i++) {
            prefixSum+=(nums[i]==1)?1:-1;
            int arrayIndex=prefixSum + n;
            if(arr[arrayIndex]!=-2) {
                maxLen=Math.max(maxLen,i-arr[arrayIndex]);
            } else {
                arr[arrayIndex] = i;
            }
        }
        return maxLen;
    }
}
