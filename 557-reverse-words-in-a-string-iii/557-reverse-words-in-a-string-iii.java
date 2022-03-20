class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n-1;i++)
        {
            String p = words[i];
            int j =p.length() - 1;
            while(j>=0)
            {
                sb.append(p.charAt(j));
                j--;
            }
            sb.append(" ");
        }
        String t = words[n-1];
        int j = t.length() -1;
        while(j>=0)
        {
            sb.append(t.charAt(j));
            j--;
        }
        return sb.toString();
        
    }
}