class Solution {
    void pushZerosToEnd(int[] nums) {
        // code here
      int n=nums.length;
      int i=0,j=0;
      while(j<n){
          if(nums[j]!=0){
              int t=nums[i];
              nums[i]=nums[j];
              nums[j]=t;
              i++;
          }
          j++;
      }
        
    }
}