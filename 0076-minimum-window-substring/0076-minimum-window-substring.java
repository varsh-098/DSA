class Solution {
    public String minWindow(String s, String t) {
        int left=0; int right=0; 
        int req[]=new int[128];
        int window[]=new int[128];
        int have=0;
        for(int i=0;i<t.length();i++){
            req[t.charAt(i)]++;
        }

        int min_length=Integer.MAX_VALUE;
        int startIndex=0;
        int req_length=t.length();
        while(right<s.length()){
            char c=s.charAt(right);
            window[c]++;

            if(window[c]<=req[c]){
                have++;
            }
            right++;

            while(have==req_length){
                if(right-left<min_length){
                    min_length=right-left;
                    startIndex=left;
                }

                char leftchar=s.charAt(left);
                window[leftchar]--;

                if(window[leftchar]<req[leftchar]){
                    have--;
                }
                left++;
            }
        }
        if(min_length==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(startIndex, startIndex+min_length);
        }
    }
}