/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int dfs(HashMap<Integer,Employee> emap,int eid)
    {
        Employee emp = emap.get(eid);
        int sum = emp.importance;
        for(Integer subid : emp.subordinates)
        {
            sum = sum + dfs(emap,subid);
        }
        return sum;
    }
    public int getImportance(List<Employee> employees, int id) {
        
        HashMap<Integer,Employee> emap = new HashMap<>();
        for(Employee e : employees)
        {
            emap.put(e.id,e);
        }
        return dfs(emap,id);
        
    }
}