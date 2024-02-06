class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       HashMap<String,List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(mp.containsKey(str)){
                mp.get(str).add(s);
            }
            else{
                mp.put(str,new ArrayList<>());
                mp.get(str).add(s);
            }
        }
        
        return new ArrayList<>(mp.values());
    }
}