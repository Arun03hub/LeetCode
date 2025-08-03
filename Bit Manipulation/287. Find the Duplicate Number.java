/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
*/
class Solution {
    public int findDuplicate(int[] nums) {
        int start=1;
        int end=nums.length-1;
        int ans=1;
        while(start<=end){
            int mid=(start+end)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count<=mid){
                start= mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}
