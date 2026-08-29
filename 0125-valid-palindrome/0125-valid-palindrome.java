class Solution {
    public boolean isPalindrome(String s) {
        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;
        s=s.toLowerCase();
        char a[]=cleanText.toCharArray();

        int left=0; int right=a.length;

        for(left=0;left<right;left++){
            right--;

            if(a[left]==a[right]){
                continue;
            }
            if(a[left]!=a[right]){
                return false;
            }
        }
        return true;


    }
}