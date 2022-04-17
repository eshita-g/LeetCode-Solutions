class Solution {
    public List<String> letterCombinations(String digits) {
        
        ArrayList<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        HashMap<Integer,String> A = new HashMap<>();
        A.put(2,"abc");
        A.put(3,"def");
        A.put(4,"ghi");
        A.put(5,"jkl");
        A.put(6,"mno");
        A.put(7,"pqrs");
        A.put(8,"tuv");
        A.put(9,"wxyz");
        String str[] = new String[digits.length()];
        for(int i=0;i<digits.length();i++)
        {
            str[i] = A.get(digits.charAt(i) - '0');
            
        }
        Comb(str,0,"",ans);
        return ans;
        
    }
    public static void Comb(String[] str,int i,String pre,ArrayList<String> ans)
    {
        if(i == str.length)
        {
            ans.add(pre);
            return;
        }
        for(int j=0;j<str[i].length();j++)
        {
            Comb(str,i+1,pre+str[i].charAt(j),ans);
        }
        
        return;
    }
}