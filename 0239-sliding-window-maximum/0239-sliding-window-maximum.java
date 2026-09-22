class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0; int right=0;
        int result[]=new int[nums.length-k+1];
        int resultindex=0;
        Deque<Integer> deque=new ArrayDeque<>();
        while(right<nums.length){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[right]){
                deque.removeLast();
            }
            deque.addLast(right);

            if(deque.peekFirst()<left){
                deque.removeFirst();
            }

            if(right-left+1==k){
                result[resultindex]=nums[deque.peekFirst()];
                resultindex++;

                left++;
            }
            right++;
        }
        return result;
    }
}