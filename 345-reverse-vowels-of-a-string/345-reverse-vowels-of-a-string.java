class Solution {
    public static boolean isNotVowel(char c){
        if((c=='a' || c=='e' || c=='i' || c=='o'|| c=='u' || c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'))
        {
            return false;
        }
        return true;
    }
    
    public String reverseVowels(String s) {
        
        int n = s.length();
        char[] str=s.toCharArray();
        int i=0;
        int j = n-1;
        while(i < j)
        {
            if(isNotVowel(str[i]))
            {
                i++;
            }
            else if(isNotVowel(str[j]))
            {
                j--;
                
            }
            else
            {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        
        return (new String(str));
    }
}