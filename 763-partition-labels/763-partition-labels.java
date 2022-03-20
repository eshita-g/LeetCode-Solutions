class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> last = new HashMap<>();
        int j =0;
        for(char c : s.toCharArray())
        {
           last.put(c,j);
            j++;
        }
        List<Integer> res = new ArrayList<>();
        int b = 0;
        int count  = 0;
        for(int i =0;i<s.length();i++)
        {
            b = Math.max(b,last.get(s.charAt(i)));
            count++;
            if( i == b)
            {
                res.add(count);
                count = 0;
            }
        }
        
        return res;
    }
}