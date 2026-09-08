class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxfreq=0;
        int maxlen=0;
        int freq[]=new int[26];

        while(right<s.length()){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            right++;

            if((right-left-maxfreq>k)){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            else{
                maxlen=Math.max(maxlen,right-left);
            }
        }
        return maxlen;
    }
}