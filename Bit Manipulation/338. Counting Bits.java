/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
*/
class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0;i<=n;i++){
            result[i]=getNoOfSets(i);
        }
        return result;
    }
     int getNoOfSets(int num){
        int count=0;
        for(int i=0;i<31;i++){
            if((num & (1<<i)) >0){
                count++;
            }
        }
        return count;
     }
}
