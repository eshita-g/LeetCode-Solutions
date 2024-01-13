class Solution {
    public int minSteps(String s, String t) {
        
        Map<Character,Integer> s_map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i),0) + 1);
        }
        Map<Character,Integer> t_map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            
            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i),0) + 1);
        }
        int count = 0;
        for(Character ch : s_map.keySet()){
            
            if(t_map.containsKey(ch) && (s_map.get(ch) > t_map.get(ch))){
                count = count + (s_map.get(ch) - t_map.get(ch));
            }
            else if(!t_map.containsKey(ch)){
                count = count + s_map.get(ch);
            }
        }
        
        return count;
        
        
        
        
    }
}