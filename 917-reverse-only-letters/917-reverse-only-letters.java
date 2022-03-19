class Solution {
    public String reverseOnlyLetters(String s) {
        char[] words = s.toCharArray();
        int n = words.length;
        int start = 0;
        int end = n-1;
        while(start < end)
        {
            if(((words[start] < 'a' || words[start] > 'z') && (words[start] < 'A'  || words[start] > 'Z'))  && ((words[end] < 'a' || words[end] > 'z') && (words[end] < 'A'  || words[end] > 'Z')))
            {
                start++;
                end--;
            }
            else if((words[start] < 'a' || words[start] > 'z') && (words[start] < 'A'  || words[start] > 'Z'))
            {
                start++;
            }
            else if((words[end] < 'a' || words[end] > 'z') && (words[end] < 'A'  || words[end] > 'Z'))
            {
                end--;
            }
            else
            {
                char c = words[end];
                words[end] = words[start];
                words[start] =c;
                start++;
                end--;
                
            }
        }
        
        return new String(words);
        
        
    }
}