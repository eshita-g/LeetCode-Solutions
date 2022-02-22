/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        unordered_set<ListNode*> A;
        while(head != NULL)
        {
            if(A.find(head) != A.end())
                return true;
            
            A.insert(head);
            head = head->next;
        }
        
        return false;
        
    }
};