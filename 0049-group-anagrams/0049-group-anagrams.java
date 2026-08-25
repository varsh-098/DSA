class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String ass=new String();
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char a[]=strs[i].toCharArray();
            Arrays.sort(a);
            ass=new String(a);

            if(!map.containsKey(ass)){
                map.put(ass,new ArrayList<>());
            }
            map.get(ass).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}