class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0)
            return "";
        Map<Character,Integer> tfreq = new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++)
        {
            char a = t.charAt(i);
            tfreq.put(a,tfreq.getOrDefault(a,0)+1);
        }
        int dist = tfreq.size();
        int c = 0;
        int start =0;
        int end = 0;
        Map<Character,Integer> sfreq = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i);
            sfreq.put(c1,sfreq.getOrDefault(c1,0)+1);
            if(tfreq.containsKey(c1) && sfreq.get(c1).equals(tfreq.get(c1)))
            {
                c++;
            }
            if(c == dist )
            {
                end= i;
                break;
            }
        }
        if(c < dist)
            return "";
        int s1 = start;
        int e1 = end;
        int min = end - start + 1;
        while(end < s.length())
        {
            while(!tfreq.containsKey(s.charAt(start)))
                    start++;
            while(tfreq.containsKey(s.charAt(start)) && (sfreq.get(s.charAt(start)) > tfreq.get(s.charAt(start))))
            {
                sfreq.put(s.charAt(start),sfreq.get(s.charAt(start)) - 1);
                start++;
                while(!tfreq.containsKey(s.charAt(start)))
                    start++;
            }
            
            if(end-start+1 < min)
            {
                min = end-start+1;
                s1 = start;
                e1 = end;
            }
            end++;
            if(end < s.length())
            {
                char d = s.charAt(end);
                sfreq.put(d,sfreq.getOrDefault(d,0) + 1);
            }
        }
        return s.substring(s1,e1+1);
        
    }
}