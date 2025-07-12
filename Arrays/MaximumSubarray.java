// 53 :MaximumSubarray
class Solution {
    public int maxSubArray(int[] nums) {
        int largesum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
             if(currentsum<0){
            currentsum=0;
            }
            currentsum= currentsum+nums[i];
            if(currentsum>largesum){
             largesum=currentsum;
            }
        }
        return largesum;
    }
}
