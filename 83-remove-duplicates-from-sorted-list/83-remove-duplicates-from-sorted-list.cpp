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
        if(head == NULL)
            return NULL;
        ListNode *prev = head;
        ListNode *cur = head;
        int data = head->val;
        while(cur != NULL )
        {
            if(cur->val != data)
            {
                prev->next = cur;
                data = cur->val;
                prev = cur;
            }
            cur = cur->next;
        }
        prev->next = NULL;
        return head;
        
        
    }
};