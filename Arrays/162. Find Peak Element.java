/*
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
*/
class Solution {
    public int findPeakElement(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                index=i;
            }
        }
        return index;
    }
}
