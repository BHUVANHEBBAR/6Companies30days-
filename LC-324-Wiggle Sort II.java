import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int []res=nums.clone();
        int i=1;
        int j=len-1;
            while(i<len){
                res[i]=nums[j];
                j--;i+=2;
            }
            i=0;
            while(i<len){
                res[i]=nums[j];
                j--;i+=2;
            }

            for(int k=0;k<len;k++){
                nums[k]=res[k];
            }
    }
}