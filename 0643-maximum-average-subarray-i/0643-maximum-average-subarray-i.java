class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0; int right=0; int sum=0; int maxsum=Integer.MIN_VALUE;
        while(right<nums.length){
            if(right-left+1<=k){
                sum=sum+nums[right];
            }

            if(right-left+1==k){
                if(sum>maxsum){
                    maxsum=sum;
                }
                sum=sum-nums[left];
                left++;
            }
            right++;
        }
        double maxavg= (double) maxsum/k;
        return maxavg;
    }
}