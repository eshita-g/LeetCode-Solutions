class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b) -> Integer.compare(b[1],a[1]));
        int i = 0;
        int count  = 0;
        while(i < boxTypes.length && truckSize > 0)
        {
            if(truckSize > boxTypes[i][0])
            {
               count = count + boxTypes[i][0] * boxTypes[i][1]; 
            }
            else
            {
                count = count + truckSize * boxTypes[i][1];
            }
            truckSize = truckSize - boxTypes[i][0];
            i++;
        }
        return count;
        
    }
}