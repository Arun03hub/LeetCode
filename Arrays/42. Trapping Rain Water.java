/*
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water
(blue section) are being trapped.
*/


class Solution {
    public int trap(int[] height) {
        int n= height.length;
       //left array
       int left[]=new int[n];
       left[0]=height[0];
       for(int i=1;i<n;i++){
        left[i]=Math.max(height[i],left[i-1]);
       }
       //rigth array
        int right[]=new int[n];
       right[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){
        right[i]=Math.max(height[i],right[i+1]);
       }
       int trappedwater=0;
       for(int i=0;i<n;i++){
        int waterlevel=Math.min(left[i],right[i]);
        trappedwater+=(waterlevel-height[i]);
       }
       return trappedwater;
    }
}
