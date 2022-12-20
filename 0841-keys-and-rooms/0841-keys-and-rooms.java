class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        int[] vis = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        vis[0] = 1;
        while(!st.isEmpty())
        {
            int x = st.pop();
            for(int p: rooms.get(x))
            {
                if(vis[p] == 0)
                {
                    vis[p] = 1;
                    st.push(p);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i] == 0)
                return false;
        }
        
        return true;
    }
}