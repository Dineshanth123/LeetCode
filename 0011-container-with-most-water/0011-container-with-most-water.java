class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int min=0;
        int max=0;
        while(left<right){
            min=Math.min(height[left],height[right]);
            max=Math.max(max,min*(right-left));
            if(height[left]<height[right])left++;
            else{
                right--;
            }

        }
        return max;
        
    }
}