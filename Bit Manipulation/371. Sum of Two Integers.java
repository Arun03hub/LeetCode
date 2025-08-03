/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.

Example 1:
Input: a = 1, b = 2
Output: 3
*/
class Solution {
    public int getSum(int a, int b) {
        int carry=0;
        while(b!=0){
            int sumWithOutCarry=a^b;
            carry=(a&b)<<1;
            b=carry;
            a=sumWithOutCarry;
        }
        return a;
    }
}
