class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;
        int left=0; int right=0;
        int count=0;
        char ch[]=s.toCharArray();
        while(right+2<ch.length){
            HashSet<Character> set=new HashSet<>();

            set.add(ch[right]);
            set.add(ch[right+1]);
            set.add(ch[right+2]);

            if(set.size()==k){
                count++;
            }

            set.clear();
            right++;
        }
        return count;
    }
}