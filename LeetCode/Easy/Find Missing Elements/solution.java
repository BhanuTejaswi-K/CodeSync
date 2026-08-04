class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
       List<Integer> list=new ArrayList<>();
       for(int i=1;i<nums.length;i++){
            int prev = nums[i - 1];
            int curr = nums[i];

            for (int j = prev + 1; j < curr; j++) {
                list.add(j);
            }
        }
        return list;
    }
}