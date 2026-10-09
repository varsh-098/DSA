class Solution {
    public int maxVowels(String s, int k) {
        int left=0; int right=0; int v_count=0; 
        int max_count=0;

        char a[]=s.toCharArray();

        while(right<a.length){
            if(a[right] == 'a' || a[right] == 'e' || a[right] == 'i' || a[right] == 'o' || a[right] == 'u'){
                v_count++;
            }

            if(right-left+1>k){
                if(a[left] == 'a' || a[left] == 'e' || a[left] == 'i' || a[left] == 'o' || a[left] == 'u'){
                    v_count--;
                }   
            left++;
            }

            if(right-left+1==k){
                max_count=Math.max(max_count,v_count);
            }
            right++;
        }
        return max_count;   
    }
}