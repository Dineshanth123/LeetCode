class Solution {
    public int findPeakElement(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(((i==0)||(nums[i-1]<=nums[i])) && ((i==len-1)||(nums[i+1]<=nums[i]))){
                return i;
            }
        }
        return -1;
        
    }
}