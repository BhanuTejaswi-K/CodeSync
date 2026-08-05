class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing=1;
        for(int i:nums){
            if(i==missing) missing++;
        }
        return missing;
    }
}