/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode *temp = dummy;
        ListNode *cur = head;
        while(cur)
        {
            bool dp =false;
            while(cur->next && cur->val == cur->next->val)
            {
                dp = true;
                cur = cur ->next;
                
            }
            if(dp)
            {
                temp->next = cur->next;
            }
            else
            {
                temp = cur;
            }
            cur = cur->next;
        }
        
        return dummy->next;
    }
};