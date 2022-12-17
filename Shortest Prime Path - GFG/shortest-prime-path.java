//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
            
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    int solve(int Num1,int Num2){
        //code here
        
        if(Num1 == Num2)
        {
            return 0;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(Num1);
        Set<String> visited = new HashSet<>();
        int level = 0;
        while(!q.isEmpty())
        {
            int p = q.size();
            while(p>0)
            {
                int number = q.remove();
                p--;
                String num = String.valueOf(number);
                if(!visited.add(num.toString()))
                {
                    continue;
                }
                for(int i=0;i<4;i++)
                {
                    StringBuffer curString = new StringBuffer(num);
                    for(char c='0';c<='9';c++)
                    {
                        if(curString.charAt(i) == c || (i==0 && c=='0'))
                        {
                            continue;
                        }
                        curString.setCharAt(i,c);
                        int changedNum = Integer.parseInt(curString.toString());
                        if(changedNum == Num2)
                        {
                            //System.out.println(changedNum);

                            return level+1;
                        }
                        if(isPrime(changedNum))
                        {

                            q.add(changedNum);
                        }
                    }
                }
                
                
            }
            //System.out.println(level);
            level++;
     
        }
        
        return -1;
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.solve(Num1,Num2));
        }
    }
}
// } Driver Code Ends