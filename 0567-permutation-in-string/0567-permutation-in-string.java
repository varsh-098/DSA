class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int right=0;
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }

        while(right<s2.length()){
            freq2[s2.charAt(right)-'a']++;
            right++;

            if(right-left>s1.length()){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }

            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}