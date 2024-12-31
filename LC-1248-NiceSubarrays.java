class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int left=0,mid=0;
        int oddcount=0;
        int len=nums.length;
        for(int right=0;right<len;right++){
            oddcount+=nums[right]%2;
            if(oddcount>k){
            mid++;
            left=mid;
            oddcount--;
            }
            while(oddcount==k && nums[mid]%2==0){
                mid++;
            }
            if(oddcount==k){
                count+=mid- left + 1;
            }
        }
        return count;
    }
    
}
//https://leetcode.com/problems/count-number-of-nice-subarrays/
// 3 pointer technique(revisit)