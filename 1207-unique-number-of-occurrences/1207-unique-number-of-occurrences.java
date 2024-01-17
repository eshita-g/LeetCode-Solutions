class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x : mp.values()){
            set.add(x);
        }
        
        return set.size() == mp.size();
    }
}