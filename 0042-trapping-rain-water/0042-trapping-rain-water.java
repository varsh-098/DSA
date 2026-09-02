class Solution {
    public int trap(int[] height) {
        int left=0; int right=height.length-1;
        int maxLeft=0; int maxRight=0; int trapped_water=0;
        while(left<right){
            if(height[left]>maxLeft){maxLeft=height[left];}
            if(height[right]>maxRight){maxRight=height[right];}

            if(maxLeft<maxRight){
                trapped_water+=maxLeft-height[left];
                left++;
            }
            else{
                trapped_water+=maxRight-height[right];
                right--;
            }
        }
        return trapped_water;
    }
}