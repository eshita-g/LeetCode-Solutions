class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int gasSum = Arrays.stream(gas).sum();
        int costSum = Arrays.stream(cost).sum();
        
        if(gasSum < costSum)
            return -1;
        
        int start = 0;
        int temp =0;
        for(int i=0;i<gas.length;i++)
        {

            temp = temp + gas[i] - cost[i];
        
            
            if(temp < 0)
            {
                start = i+1;
                temp = 0;
            }
        }
        
        
        return start;
        
    }
}