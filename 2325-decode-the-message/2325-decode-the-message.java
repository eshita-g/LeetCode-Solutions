class Solution {
    public String decodeMessage(String key, String message) {
        
        Map<Character,Character> mp = new HashMap<>();
        char value = 'a';
        for(int i=0;i<key.length();i++){
            
            if(key.charAt(i) != ' '){
                
                if(!mp.containsKey(key.charAt(i))){
                    
                    mp.put(key.charAt(i),value);
                    value =(char) ((int)value + 1);
                    
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<message.length();i++){
            
            if(message.charAt(i) != ' '){
                sb.append(mp.get(message.charAt(i)));
            }
            else
            {
                sb.append(' ');
            }
        }
        
        return sb.toString();
        
        
    }
}