class Solution {
    public int minimumRounds(int[] tasks) {
        
        int n = tasks.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0) + 1);
        }
        int count = 0;
        for(int key : mp.keySet())
        {
            if(mp.get(key) == 1)
            {
                return -1;
            }
            count = count + mp.get(key)/3 + (mp.get(key) % 3 == 0 ? 0 : 1);

        }

        return count;
    }
}