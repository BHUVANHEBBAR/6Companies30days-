import java.util.Arrays;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int mid=nums[len/2];
        int moves=0;
        for(int ele:nums){
            moves+=Math.abs(mid-ele);
        }
        return moves;
    }
}
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/