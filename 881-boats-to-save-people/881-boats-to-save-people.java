class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int j = people.length - 1;
        Arrays.sort(people);
        int count  = 0;
        int i =0;
        while(i<=j)
        {
            count++;
            if(people[i] + people[j] <= limit)
                i++;
            
            j--;
        }
        return count;
        
    }
}